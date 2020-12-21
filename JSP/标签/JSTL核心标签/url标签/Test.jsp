<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        <c:out value = "url test"/>
        <hr/>
        <c:url value = "http://www.baidu.com" var = "url" scope = "session"/>
        <a href = "${url}" style = "color = yellow;">click it!</a>
        <c:url value = "http://www.baidu.com" var = "paramUrl">
            <c:param name = "userName" value = "HHH"/>
            <c:param name = "pwd" value = "123456"/>
        </c:url>
        <a href = "${paramUrl}" style = "color:green;">click it!</a>
    </body>
</html>
