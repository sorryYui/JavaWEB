<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>表单</title>
</head>
<body>
    <fieldset style = "width : 500px;">
        <label>表单元素</label>
        <form action = "${pageContext.request.contextPath}/hello" method = "post">
            编&nbsp;&nbsp;号：
            <input type = "text" name = "userId" value = "NO." size = "2" maxlength = "2" > <br>
            用户名：
            <input type = "text" name = "userName" value = "Name"><br>
            <input type = "submit" value = "submit">
        </form>
    </fieldset>
</body>
</html>
