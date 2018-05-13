<%-- 
    Document   : login
    Created on : 13/05/2018, 11:33:08 PM
    Author     : Patty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <fieldset>
                <legend class="text-center">Login</legend>
                <form action="loginAction.jsp" method="POST">
                    <div class="form-group">
                        <input type="email" class="form-control" aria-describedby="emailHelp" placeholder="Enter email">
                        <input type="password" class="form-control" placeholder="Password">   
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button> 
                </form>
            </fieldset>   

        </div>
    </body>
</html>