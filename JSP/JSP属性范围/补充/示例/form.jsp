<%@ page contentType = "text/html;charset = UTF-8"%>
<%@ page import = "java.util.*"%>
<head>
    <title> Form </title>
</head>
<%
    pageContext.setAttribute("name","HHH",pageContext.REQUEST_SCOPE);
    pageContext.setAttribute("date",new Date(),pageContext.REQUEST_SCOPE);
%>
<jsp:forward page = "/next.jsp"/>
