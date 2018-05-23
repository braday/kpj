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
                <!--<input type="hidden" name="action" value =dologin"/>-->
                <table>
                    <tbody>
                        <tr>
                            <td><label for="email">Email</label></td>
                            <td><input name="email" type="text" value="<%= request.getAttribute("email")%>"></td>
                        </tr>
                        <tr>
                            <td><label for="password">Password</label></td>
                            <td><input name="password" type="password" value="<%= request.getAttribute("password")%>"/></td>
                        </tr>
                        <tr><td><input type="submit" value="Login"></td></tr>
                    <p><%--= request.getAttribute("error_msg")--%></p>
                    </tbody>
                </table>
            </form>
        </fieldset>
    </body>
</html>
