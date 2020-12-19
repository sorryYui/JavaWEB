<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title> Test </title>
    </head>
    <body>
        <h3><c:out value = "演示"/></h3>
        <ul>
            <li><c:out value = "<a href = 'http://www.baidu.com'>cilck it!</a>"/></li>
            <li><c:out value = "<a href = 'http://www.baidu.com'>cilck it!</a>" escapeXml = "false"/></li>
            <li><c:out value = "${null}"/></li>
            <li><c:out value = "${null}" default = "HHH"/></li>
        </ul>
    </body>
</html>
