<%@ page contentType = "text/html;charset = UTF-8"%>
<%@ page import = "java.util.*"%>
<head>
    <title> Form </title>
</head>
<jsp:forward page = "/next.jsp">
    <jsp:param name = "name1" value = "value1"/>
    <jsp:param name = "name2" value = "value2"/>
</jsp:forward>
