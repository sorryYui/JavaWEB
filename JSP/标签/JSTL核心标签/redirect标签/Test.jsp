<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        <c:redirect url = "http://www.baidu.com">
            <c:param name = "userName" value = "HHH"/>
            <c:param name = "pwd" value = "123"/>
        </c:redirect>
    </body>
</html>
