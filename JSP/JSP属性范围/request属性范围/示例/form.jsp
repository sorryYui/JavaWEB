<%@ page language = "java" import = "java.util.*" pageEncoding = "UTF-8"%>
<head>
    <title> Form </title>
</head>
<%
    request.setAttribute("name","HHH");
    request.setAttribute("date",new Date());
%>
<jsp:forward page = "/next.jsp"/>
