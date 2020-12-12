<%@ page contentType = "text/html;charset = UTF-8"%>
<%@ page import = "java.util.*"%>
<head>
    <title> Form </title>
</head>
<%
    session.setAttribute("name","HHH");
    session.setAttribute("date",new Date());
%>
<h1 style = "color:yellow;"><a href = "${pageContext.request.contextPath}/next.jsp">next</a></h1>
