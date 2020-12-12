<%@ page language = "java" import = "java.util.*" pageEncoding = "UTF-8"%>
<head>
    <title>Next</title>
</head>
<%
    String name = (String)session.getAttribute("name");
    Date date = (Date)session.getAttribute("date");
%>
<h1 style = "color:yellow;"> name : <%= name%></h1>
<h1 style = "color:blue;">date : <%= date%></h1>
