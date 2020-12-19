<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        <form action = "Test.jsp" method = "post">
            <input type = "text" name = "uname" value = "${parma.uname}"/>
            <input type = "submit" value = "login"/>
        </form>
        <c:if test = "${param.uname == 'admin'}" var = "adminCheck">
            <c:out value = "Welcome,admin."/>
        </c:if>
    </body>
</html>
