<%@ include file = "header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String submitted = request.getParameter("submitted");

        if (submitted != null && submitted.equals("yes")) {
            // Grab all the user input
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String agreeTOS = request.getParameter("tos");
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <%
            if (agreeTOS != null) {
        %>
        <p>Welcome,  <%=name%>!</p>
        
        <% 
            // set session to store
            book.wsd.User user = new book.wsd.User(name, email, password);
            session.setAttribute("user", user);
        %>
        <p>Click <a href="main.jsp">here</a> to go to main page.</p>
        
        <%} else {%>
        <p>Sorry, you must agree to the Terms of Services.</p>
        <p>Click <a href="register.jsp">here</a> to go back.</p>
        <%}%>
    </body>

    <%} else {%>
    <body>
        <h2>Enter your details:</h2>
        <form method="POST" action="register.jsp">
            <input type="hidden" name="submitted" value="yes" />
            <table>
                <tr><td>Full Name:</td><td><input type="text" name="name"></td></tr>
                <tr><td>Email:</td><td><input type="text" name="email"></td></tr>
                <tr><td>Password :</td><td><input type="password" name="password"></td></tr>
                <tr><td>Agree to TOS</td><td><input type="checkbox" name="tos"></td><tr>
                <tr><td></td><td><input type="submit" value="Register"></td></tr>
            </table>            
        </form>
    </body>
    <%}%>
</html>
