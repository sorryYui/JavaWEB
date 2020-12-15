<%@ page language = "java" import = "ServletDemoTest.UserBean" pageEncoding = "UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title> login </title>
    </head>
    <body>
        <form action = "${PageContext.request.contextPath}/ServletDemo/login" method = "post">
            <input type = "hidden" name = "submitFlag" value = "login"/>
            name:<input type = "text" name = "username" value = "${user.username}"/><br />
            password:<input type = "password" name = "password"/><br />
            <input type = "submit" value = "login"/>
        </form>
    </body>
</html>
