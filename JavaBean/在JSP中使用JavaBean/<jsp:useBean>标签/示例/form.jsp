<%@ page language = "java" import = "java.util.*" pageEncoding = "UTF-8"%>
<jsp:useBean id = "peason" class = "ServletDemoTest.BeanDemo" scope = "page"/>
<%
    peason.setName("name");
    peason.setAge(19);
%>
<h1 style = "color:green"><%=peason.getName()%></h1>
<h1 style = "color:red"><%=peason.getAge()%></h1>
