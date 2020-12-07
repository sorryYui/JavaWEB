<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>表单</title>
</head>
<body>
    <form action = "${pageContext.request.contextPath}/doForm" methos = "post">
        用户名: <input type = "text" name = "username">
        <input type = "submit" value = "submit" id = "submit">
    </form>
</body>
</html>
