<%@ page language = "java" import = "java.util.*" pageEncoding = "UTF-8"%>
<head>
    <title>Next</title>
</head>
<%
    String name = (String)request.getAttribute("name");
    Date date = (Date)pageContext.getAttribute("date",pageContext.REQUEST_SCOPE);
%>
<h1 style = "color:yellow;"> name : <%= name%></h1>
<h1 style = "color:blue;">date : <%= date%></h1>
