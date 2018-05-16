<%@page import="book.wsd.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <%
        String submitted = request.getParameter("submitted");
        String redirectURL = "index.jsp";

        if (submitted != null && submitted.equals("yes")) {

            // Grab all the user input
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String agreeTOS = request.getParameter("tos");
            //Boolean submitted = "yes".equals(request.getParameter("submitted"));
    %>
    <body>
        <%  if (agreeTOS != null) {
            response.sendRedirect(redirectURL);
        %>
        <h1>Welcome!</h1>
        <p>Welcome,  <%=name%>!</p>
        <p>Your Email is <%=email%> </p>
        <p>Your Password is <%=password%> </p>
        <%
            User user = new User(email, name, password);
            session.setAttribute("user", user);
        %>
        <p>Click <a href="index.jsp">here</a> to go back.</p>
        <%} else {%>
        <p>Sorry, you must agree to the Terms of Services.</p>
        <p>Click <a href="register.jsp">here</a> to go back.</p>
        <%}%>
        <%} else {%>
        <h1>Register</h1>
        <form action="register.jsp" method="POST">
            <input type="hidden" name="submitted" value="yes" />
            <table>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email"> </td>
                </tr>
                <tr>
                    <td>Full name</td>
                    <td><input type="text" name="name" </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" </td>
                </tr>
                <tr>
                    <td>Agree to TOS</td>
                    <td> <input type="checkbox" name="tos"></td> 
                <tr>
                    <td><input type="submit" value="Register" </td>
                </tr>
                </tr>
            </table>
        </form>
    </body>
    <%}%>

</html>