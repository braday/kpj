<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    
    <xsl:template match="/">
        <html>
            <head>
                <title>books.xsl</title>
            </head>
            <body>
                <xsl:apply-templates/> 
            </body>
        </html>
    </xsl:template>
    
    <!--title element-->
    <xsl:template match="bookshop/name">
        <h1>
            <xsl:apply-templates/>
        </h1>
    </xsl:template>
    
    <!--booklist element-->
    <xsl:template match="books"> <!-- id? -->
        <table>
            <thead>
                <tr>
                    <th>ref#</th>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Category</th>
                    <th>qty</th>
                    <th>price</th>
                </tr>
            </thead>
            <tbody>
                <!--match each book template and its child element-->
                <xsl:apply-templates/>
            </tbody>
        </table>
    </xsl:template>
    
    <!--A email element that is a direct child of user, OR a name element, OR a password element.-->
    <!--if found user's child element, apply template to find that-->
    <xsl:template match="id|title|author|category|qty">
        <tr>
            <xsl:apply-templates/>
        </tr>
    </xsl:template>

</xsl:stylesheet>

<!--
<publication>
    <isbn>978-3-16-148410-0</isbn>
    <edition>3rd edition</edition>
    <pubYear>2014</pubYear>
    <publisher>Wiley</publisher>
    <condition>Good</condition>
</publication>-->
