<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@ page import = "java.util.*"%>
<%@ page import = "ServletDemoTest.PersonBean"%>
<!DOCTYPE HTML>
<jsp:useBean id = "person" class = "ServletDemoTest.PersonBean"/>
<jsp:setProperty name = "person" property = "name" value = "HHH"/>
<jsp:setProperty name = "person" property = "address" value = "China"/>
<jsp:setProperty name = "person" property = "age" value = "19"/>
<%
    request.setAttribute("data","data");
%>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        <h1 style = "color:red;">${data}</h1>
        <h1 style = "color:green;">${person.name}</h1>
        <h1 style = "color:blue;">${person.address}</h1>
        <h1 style = "color:yellow;"><jsp:getProperty name = "person" property = "age"/></h1>
    </body>
</html>
