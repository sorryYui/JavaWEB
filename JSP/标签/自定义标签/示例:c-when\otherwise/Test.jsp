<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@taglib uri = "/TagTest" prefix = "c"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title> Test </title>
    </head>
    <body>
        <c:choose>
            <c:when test = "${user == null}">
                <h3 style = "color:red;"> The User is not here </h3>
            </c:when>
            <c:otherwise>
                <h3 style = "color:green;">The User is here </h3>
            </c:otherwise>
        </c:choose>
        <c:choose>
            <c:when test = "${user != null}">
                <h3 style = "color:green;">The User is here </h3>
            </c:when>
            <c:otherwise>
                <h3 style = "color:red;">The User is not here</h3>
            </c:otherwise>
        </c:choose>
    </body>
</html>
