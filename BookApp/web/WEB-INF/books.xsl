<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                xmlns="http://www.uts.edu.au/31284/wsd-books"
                version="2.0">
    
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
                        <!--match each book template and its child element-->
                        <xsl:apply-templates/>
                    </tbody>
                </table>
                <p>Total Books No# : <xsl:value-of select="count(books/book)"/></p>
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
            <!--<xsl:apply-templates/>-->   
        </tr> 
    </xsl:template>
    <xsl:template match="description"/>
    <xsl:template match="isbn"/>
    <xsl:template match="edition"/>
    <xsl:template match="pubYear"/>
    <xsl:template match="publisher"/>

</xsl:stylesheet>


    
<!--   
<xsl:template match="book/author|category|qty|price|condition">
    <td>
        <xsl:apply-templates/>
    </td>
</xsl:template>-->
     
<!--    <xsl:template match="book/publication">
    <xsl:apply-templates/>
</xsl:template>
<xsl:template match="book/publication|description|isbn|edition|pubYear|publisher">
    <td>
        <xsl:apply-templates/>
    </td>
</xsl:template>-->