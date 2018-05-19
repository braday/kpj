<%-- 
    Document   : loginAction
    Created on : 17/05/2018, 12:15:47 AM
    Author     : Patty
--%>

<%@page import="book.wsd.*" contentType="text/html" pageEncoding="UTF-8"%>
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

            Users users = userApp.getUsers();
            User user = users.login(email, password);

            if (user != null) { // the login was successful
                session.setAttribute("user", user);
                response.sendRedirect(redirectURL);
        %>
        <fieldset>
            <legend>loginAction.jsp</legend>
            <p>Login successful. Click <a href="index.jsp"> here</a> to return to the main page.</p>

            <% } else {%>
            <p>Password incorrect. Click <a href="login.jsp"> here</a> to try again.</p>
            <%}%>
        </fieldset>
    </body>
</html>
