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
            String name = request.getParameter("name");
            String error = request.getParameter("message");
            String redirectURL = "index.jsp";
            String loginURL = "login.jsp";

            if (!email.matches("\\w+@\\w+\\.\\w+")) {
                error = "invalid email!";
            }

            if (password.length() < 4) {
                error = "errrr";
            } else if (!password.matches("\\w*\\s+\\w*")) {
                //char contains space
                error = "contains space!!!";
            }

            Users users = userApp.getUsers();

            User user = users.login(email, password);

            // The email and password are validated
            if (user != null) {
                //response.sendRedirect(redirectURL);
                session.setAttribute("user", user);
        %>  
        <fieldset>
            <p>Login successful. Click <a href="index.jsp"> here</a> to return to the main page.</p>
            <p>email: <%= email%></p>
            <p>password: <%=password%></p>          

            <% } else {
//                response.sendRedirect(loginURL);
            %>    
            <p><%= error%></p>
            <p>Password incorrect. Click <a href="login.jsp"> here</a> to try again.</p>

            <%}%>
        </fieldset>
    </body>
</html>
