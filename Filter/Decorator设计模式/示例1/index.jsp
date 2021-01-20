<%@page language = "java" pageEncoding = "UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPY HTML>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        <c:url value = "/test" scope = "page" var = "servletDemo">
            <c:param name = "username" value = "HHHHH"/>
        </c:url>
        <a href = "${servletDemo}">href</a>
        <hr />
        <form action = "${pageContext.request.contextPath}/test" method = "post">
            username:<input type = "text" name = "username" value = "HHHHHHH"/>
            <input type = "submit" value = "post"/>
        </form>
    </body>
</html>
