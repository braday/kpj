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
    --%>
    <body>
        <% String filePath = application.getRealPath("WEB-INF/books.xml");%>
        <jsp:useBean id="bookApp" class="book.wsd.BookApplication" scope="application">
            <jsp:setProperty name="bookApp" property="filePath" value="<%=filePath%>"/>
        </jsp:useBean>
        <% 
            Books bookList = bookApp.getBooks();
            ArrayList<Book> list = bookList.viewBooks();
            
        %>
        <div class="container">

            <table class="table text-center table-hover">
                <tbody>
                    <tr>
                        <% for(Book book : list ){ %>
                        <td>title <%= book.getAuthor() %></td>
                        <td>author</td>
                        <td>category</td>
                        <td>#</td>
                        <%}%>
                    </tr>
                </tbody>
            </table>      
        </div>

    </body>
</html>
