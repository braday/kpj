<%@page import="book.wsd.*" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file = "header.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <div class="container">
            <table class="table text-center table-hover">
                <thead class="thead-light">
                    <tr>
                        <th scope="col">Title</th>
                        <th scope="col">Author</th>
                        <th scope="col">Category</th>
                        <th scope="col">Copies#</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>%{book title}</td>
                        <td>%{book author}</td>
                        <td>%{book category}</td>
                        <td>%{book copies}</td>
                    </tr>
                </tbody>
            </table>      
        </div>

    </body>
</html>
