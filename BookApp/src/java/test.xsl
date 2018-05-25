<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : test.xsl
    Created on : 25 May 2018, 5:03 PM
    Author     : Putty
    Description:
        Purpose of transformation follows.
-->

<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:variable name="header">
  <tr bgcolor="#9acd32">
    <th>Title</th>
    <th>Artist</th>
  </tr>
</xsl:variable>

<xsl:template match="/">
  <html>
  <body>
  <table border="1">
    <xsl:copy-of select="$header" />
    <xsl:for-each select="catalog/cd">
      <tr>
        <td><xsl:value-of select="title"/></td>
        <td><xsl:value-of select="artist"/></td>
      </tr>
    </xsl:for-each>
  </table>
  </body>
  </html>
</xsl:template>

</xsl:stylesheet>
