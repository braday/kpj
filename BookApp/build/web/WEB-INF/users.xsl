<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    
    <xsl:template match="/">
        <html>
            <head>
                <title>users.xsl</title>
            </head>
            <body>
                <!--All templates with element-->
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>
    <!--title element-->
    <xsl:template match="users/title">
        <h1>
            <xsl:apply-templates/>
        </h1>
    </xsl:template>
     
    <!--users element-->
    <xsl:template match="users">
        <table>
            <thead>
                <tr>
                    <th>Email</th>
                    <th>Name</th>
                    <th>Password</th>
                </tr>
            </thead>
            <tbody>
                <!--match track template and its child element-->
                <xsl:apply-templates/>
            </tbody>
        </table>        
    </xsl:template>
    
    <xsl:template match="user">
        <tr>
            <xsl:apply-templates/>
        </tr>
    </xsl:template>
    
    <!--A email element that is a direct child of user, OR a name element, OR a password element.-->
    <!--if found user's child element, apply template to find that-->
    <xsl:template match="user/email|name|password">
        <td>
            <xsl:apply-templates/>
        </td>          
    </xsl:template>
    
</xsl:stylesheet>
