<%-- 
    Document   : logout.jsp
    Created on : 04/04/2018, 1:28:35 PM
    Author     : Patty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Page</title>
    </head>
    <body>
        <%
            session.invalidate();
        %>
        <fieldset>
            <legend>logout.jsp</legend>
              <p>You have been logged out. Click <a href="main.jsp">here</a> to return to the main page.</p>
        </fieldset>
    </body>
</html>
