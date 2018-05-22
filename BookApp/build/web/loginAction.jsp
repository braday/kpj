<%@page import="book.wsd.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String filePath = application.getRealPath("WEB-INF/users.xml");%>
        <jsp:useBean id="userApp" class="book.wsd.UserApplication" scope="application">
            <jsp:setProperty name="userApp" property="filePath" value="<%=filePath%>"/>
        </jsp:useBean>

        <%
            // preset from users.xml
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String redirectURL = "index.jsp";

            String message = "";

            Users users = userApp.getUsers();
            User user = users.login(email, password);

            // The email and password are correct
            if (user == null) {
                message = "hello";
        %>
        <fieldset>
            <legend>login.jsp</legend>
            <h1>Login</h1>
            <form method="POST" action="login.jsp">
                <table>
                    <tbody>
                        <tr>
                            <td><label for="email">Email</label></td>
                            <td><input name="email" type="text" value=""></td>
                        </tr>
                        <tr>
                            <td><label for="password">Password</label></td>
                            <td><input name="password" type="password"></td>
                        </tr>
                        <tr><td></td><td><input type="submit" value="Login"></td></tr>
                    </tbody>
                </table>
            </form>
        </fieldset>

        <% } else {
            session.setAttribute("user", user);
            response.sendRedirect(redirectURL);%>
        <%}%>

    </body>
</html>
