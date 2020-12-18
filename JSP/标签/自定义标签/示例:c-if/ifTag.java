<%@page language = "java" pageEncoding = "UTF-8"%>
<%@taglib uri = "/WEB-INF/SimpleTagTest.tld" prefix = "c"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title> Head </title>
    </head>
    <body>
        <c:if test="true">
            <h1 style = "color:red;"> HHH </h1>
        </c:if>
        <c:if test="false">
            <h1 style = "color:green;"> HHH </h1>
        </c:if>
    </body>
</html>
