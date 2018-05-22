<%@page import="book.wsd.dom.*"%>
<%@page import="book.wsd.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<!--Code library-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--Formatting library-->
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<%@ include file = "header.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            </table>
            <!-- Replace the URL value with the location of movies.xml on your PC, not the whole path -->
            <c:import url="WEB-INF/books.xml" 
                      var="inputDoc" />

            <!-- Replace the URL value with the location of movies.xsl on your PC-->
            <c:import url="WEB-INF/books.xsl"
                      var="stylesheet" />

            <!-- Transform xml inputDoc using stylesheet -->
            <x:transform xml  = "${inputDoc}" xslt = "${stylesheet}">        
                <x:param name="bgColor"  value="lightgreen" />
            </x:transform>

        </div>

    </body>
</html>
