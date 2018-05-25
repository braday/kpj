<%@page import="book.wsd.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>

<%@ include file = "header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <legend>login.jsp</legend>
            <form method="POST" action="loginAction.jsp">
                <input type="hidden" name="action" value =dologin"/>
                <table>
                    <tbody>
                        <tr>
                            <td><label for="email">Email</label></td>
                            <td><input name="email" type="text" value=""></td>
                        </tr>
                        <tr>
                            <td><label for="password">Password</label></td>
                            <td><input name="password" type="password" value=""/></td>
                        </tr>
                        <tr><td><input type="submit" value="Login"></td></tr>
                    <p></p>
                    </tbody>
                </table>
            </form>
        </fieldset>
    </body>
</html>
