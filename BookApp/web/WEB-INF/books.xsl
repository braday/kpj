<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : books.xsl
    Created on : 27 May 2018, 10:38 PM
    Author     : Patty
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:output method="html"/>
    
    <xsl:template match="/"> <!-- root element -->
        <html>
            <head>
                <title>books.xsl</title>
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous"/>
            </head>
            <body>
                <!--All templates with element-->
                <table class="table text-center">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Category</th>
                            <th>Qty</th>             
                        </tr>
                    </thead>
                    <tbody>
                        <!--invoke the book element-->
                        <xsl:apply-templates/>
                    </tbody>
                </table>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="book">
        <xsl:variable name="href">bookDetail.jsp?title=<xsl:value-of select="title"/></xsl:variable>  
        <tr>
            <td>
                <a href="{$href}">
                    <xsl:value-of select="title"/>
                </a>
            </td>
        
            <td>
                <xsl:value-of select="author"/>
            </td>
            <td>
                <xsl:value-of select="category"/>
            </td>
    
            <td>
                <xsl:value-of select="qty"/>
            </td>
        </tr> 
    </xsl:template>

</xsl:stylesheet>
