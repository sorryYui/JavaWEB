<%@ page language = "java" import = "java.util.*" pageEncoding = "UTF-8"%>
<head>
    <title> Form </title>
</head>
<%
    pageContext.setAttribute("name","HHH");
    pageContext.setAttribute("date",new Date());
%>
<%
    String name = (String)pageContext.getAttribute("name");
    Date date = (Date)pageContext.getAttribute("date");
%>
<h1 style = "color:yellow;"> name : <%=name%></h1>
<h1 style = "color:blue;"> date : <%=date%></h1>
