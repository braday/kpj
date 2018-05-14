<%-- 
    Document   : header
    Created on : 13/05/2018, 12:25:53 PM
    Author     : Patty
--%>

<%@page import="book.wsd.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Book App</title>

        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">

        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/style.css">

    </head>
    <body>
        <!--Retrieve data from session obj-->
        <%       User user = (User) session.getAttribute("user"); %>
        <div class="container">
            <nav class="navbar navbar-light" style="background-color:#e3f2fd;">
                <a class="navbar-brand" href="index.jsp">BookApp</a>
                <ul class="nav justify-content-end">
                    <li class="nav-item">
                        <a class="nav-link" href="#">My List</a>
                    </li>
                    <!--need to show before login-->
                    <%
                        if (user != null) {
                    %>
                    <li class="nav-item">You are logged in as <%=user.getName()%></li>
                    <li class="nav-item">
                        <a class="nav-link" href="logout.jsp">Logout</a>
                    </li>
                    <%} else {%>
                    <!--need to show this but hide the login/register-->
                    <li class="nav-item">
                        <a class="nav-link active" href="register.jsp">Register</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="login.jsp">Login</a>
                    </li>
                    <%}%>
                </ul>
            </nav>
        </div>
    </body>
</html>
