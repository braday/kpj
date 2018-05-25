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
            // get user email and password
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String error = request.getParameter("message");
            String loginURL = "login.jsp";

            Users users = userApp.getUsers();

            User user = users.login(email, password);

            if (user != null || email != null && password != null) {
        %>

        <form method="POST" action="loginAction.jsp">
            <table>
                <tbody>
                    <tr>
                        <% 
                            if (!email.matches("\\w+@\\w+\\.\\w+")) {
                                error = "invalid email!";
                        %>
                        <td><label for="email">Email</label></td>
                        <td><input name="email" type="text" value="<%=email%>"></td>
                        <p><%= error%></p>
                        <%}%>
                    </tr>
                <tr>
                    <%
                        if (password.length() < 4) {
                            error = "errrr";
                        } 
                        else if (!password.matches("\\w*\\s+\\w*")) {
                            //char contains space
                            error = "email contains space!!!";
                    %>
                    <td><label for="password">Password</label></td>
                    <td><input name="password" type="password" value="<%=password%>"/></td>
                <p><%= error%></p>
                <%}%>
                </tr>
                <tr><td><input type="submit" value="Login"></td></tr>
                <p></p>
                </tbody>
            </table>
        </form>   

        <% } else {
            //response.sendRedirect(redirectURL);
            session.setAttribute("user", user);
        %> 

        <p>Login successful. Click <a href="index.jsp"> here</a> to return to the main page.</p>
        <p>email: <%= email%></p>
        <p>password: <%=password%></p> 

        <%}%>
    </fieldset>
</body>
</html>
