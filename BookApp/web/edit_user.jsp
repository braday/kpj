<%-- 
    Document   : edit_user.jsp
    Created on : 04/04/2018, 5:17:07 PM
    Author     : Patty
--%>

<%@page import="book.wsd.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            User user = (User) session.getAttribute("user");

            // causing the issue with the tenary operator due to empty email
            if (request.getParameter("email") != null) {
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String password = request.getParameter("password");

                user.setName(name);
                user.setEmail(email);
                user.setPassword(password);
        %>
        <p>Details updated.</p>
        <%
            }
        %>
        <fieldset>
            <legend>edit_user.jsp</legend>
            <h1>My Account</h1>
            <form action="edit_user.jsp" method="POST">
                <table>
                    <tr><td>Email</td><td><input type="text" value="<%= user.getEmail()%>" name="email"></td></tr>
                    <tr><td>Full name</td><td><input type="text" value="<%= user.getName()%>" name="name"></td></tr>
                    <tr><td>Password</td><td><input type="password" value="<%= user.getPassword()%>" name="password"></td></tr>
                </table>
                <input type="submit" value="Save">
                <p>Return to the <a href="index.jsp">main page</a></p>

            </form>
        </fieldset>
    </body>
</html>
