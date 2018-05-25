<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>bookDetail.xsl</title>
            </head>
            <body>
                <table class="table text-center">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Category</th>
                            <th>Qty</th>
                            <th>Abstract</th>
                            <th>ISBN</th>
                            <th>Edition</th>
                            <th>Year</th>
                            <th>Publisher</th>
                            <th>Status</th>               
                        </tr>
                    </thead>
                    <tbody>
                        <!--match each book template and its child element-->
                        <xsl:apply-templates/>
                    </tbody>
                </table>
            </body>
        </html>
    </xsl:template>  
    
    <xsl:template match="bookshop/book">
        <!--<xsl:variable name="href">bookDetail.jsp?title=<xsl:value-of select="title"/></xsl:variable>-->  

        <tr>
            <td>
                <xsl:value-of select="title"/>
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
            <xsl:apply-templates/>   
        </tr> 
    </xsl:template>
    
    
    <!--Access to publication-->
    <xsl:template match="book/publication">
        <xsl:apply-templates/>
        <!--        <td>
            <xsl:value-of select="description"/>
        </td>
        <td>
            <xsl:value-of select="isbn"/>
        </td>
        <td>
            <xsl:value-of select="edition"/>
        </td>
        <td>
            <xsl:value-of select="pubYear"/>
        </td>
        <td>
            <xsl:value-of select="publisher"/>
        </td>        -->

    </xsl:template>
    <xsl:template match="book/publication|description|isbn|edition|pubYear|publisher">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>

</xsl:stylesheet>



