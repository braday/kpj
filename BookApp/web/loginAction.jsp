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
            String loginURL = "login.jsp";


            Users users = userApp.getUsers();
            User user = users.login(email, password);

            // The email and password are correct
            if (user != null) {
                session.setAttribute("user", user);
                //response.sendRedirect(redirectURL);
        %>
        <fieldset>
            <p>Login successful. Click <a href="index.jsp"> here</a> to return to the main page.</p>
            <p>email: <%= email%></p>
            <p>password: <%=password%></p>
            <% } else {%>
            <p>Password incorrect. Click <a href="login.jsp"> here</a> to try again.</p>
            <!--response.sendRedirect(redirectURL);-->
            <%}%>
        </fieldset>
    </body>
</html>
