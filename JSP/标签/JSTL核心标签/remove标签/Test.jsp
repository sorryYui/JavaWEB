<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE HTML>
<html>
    <c:set var = "data1" value = "hhh"/>
    <c:set var = "data2" value = "HHH"/>
    <head>
        <title>Test</title>
    </head>
    <body>
        <p>
            <c:out value = "${pageScope.data1}"/><br/>
            <c:out value = "${data2}"/><br/>
        </p>
        <c:remove var = "data1" scope = "page"/>
        <p>
            <c:out value = "${pageScope.data1}"/><br/>
            <c:out value = "${data2}"/><br/>
        </p>
    </body>
</html>
