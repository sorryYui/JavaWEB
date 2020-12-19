<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        <form action = "Test.jsp" method = "post">
            <input type = "text" name = "score" value = "${parma.score}"/>
            <input type = "submit" value = "submit"/>
        </form>
        <c:choose>
            <c:when test = "${param.score >= 90}">
                <c:out value = "优秀"/>
            </c:when>
            <c:when test = "${param.score < 90 && param.score >= 70}">
                <c:out value = "良好"/>
            </c:when>
            <c:when test = "${param.score < 70 && param.score >= 60}">
                <c:out value = "及格"/>
            </c:when>
            <c:otherwise>
                <p style = "color:red">
                    <c:out value = "HHHHH"/>
                </p>
            </c:otherwise>
        </c:choose>
    </body>
</html>
