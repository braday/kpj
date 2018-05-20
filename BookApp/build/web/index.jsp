<%@page import="book.wsd.dom.BooksPrinter"%>
<%@page import="book.wsd.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%@ include file = "header.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%--  
        <% String filePath = application.getRealPath("WEB-INF/books.xml");%>
        <jsp:useBean id="bookApp" class="book.wsd.BookApplication" scope="application">
            <jsp:setProperty name="bookApp" property="filePath" value="<%=filePath%>"/>
        </jsp:useBean>
    
        <%
            Books bookList = bookApp.getBooks();
            ArrayList<Book> list = bookList.getBooks();

        %>
        --%>
        <div class="container">
            <table class="table text-center table-hover">
                <tbody>
                    <tr>
                        <th>title </th>
                        <th>author</th>
                        <th>category</th>
                        <th>#</th>
                    </tr>
                    
                </tbody>
            </table>      
        </div>

    </body>
</html>
