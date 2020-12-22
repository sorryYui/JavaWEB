<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@ taglib uri = "/ELTest" prefix = "f"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        ${f:filter("<a href = ''>HHH</a>")}
    </body>
</html>
