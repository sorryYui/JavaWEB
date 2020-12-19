<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title> Test <title>
    </head>
    <body>
        <c:out value = "示例<hr/>"/>
        <c:catch var = "errorInfo">
            <c:import url = "http://www.baidu.com" charEncoding = "UTF-8"/>
        </c:catch>
        </hr>
        <c:catch var = "errorInfo_tmp">
            <c:import url = "next.html" charEncoding = "UTF-8"/>
        </c:catch>
    </body>
</html>
