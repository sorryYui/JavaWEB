<%@ page language = "java" import = "java.util.*" pageEncoding = "UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        <c:catch var = "errorInfo">
            <c:set target = "person" property = "HHH">HHH</c:set>
        </c:catch>
        <c:out value = "${errorInfo}"/><br/>
        <c:out value = "${errorInfo.message}"/><br/>
        <c:out value = "${errorInfo.cause}"/><br/>
        <c:out value = "${errorInfo.stackTrace}"/><br/>
    </body>
</html>
