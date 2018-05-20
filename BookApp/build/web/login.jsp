<%-- 
    Document   : login
    Created on : 17/05/2018, 12:12:32 AM
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
        <fieldset>
            <legend>login.jsp</legend>
            <h1>Login</h1>
            <form method="POST" action="loginAction.jsp">
                <table>
                    <tbody>
                        <tr>
                            <td><label for="email">Email</label></td>
                            <td><input name="email" type="text"></td>
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
    </body>
</html>
