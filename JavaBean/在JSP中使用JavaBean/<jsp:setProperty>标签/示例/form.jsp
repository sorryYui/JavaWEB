<%@ page language = "java" import = "java.util.*" pageEncoding = "UTF-8"%>
<jsp:useBean id = "person" class = "ServletDemoTest.BeanDemo" scope = "page"/>
<jsp:setProperty name = "person" property = "name" value = "HHHH"/>
<jsp:setProperty name = "person" property = "age" value = "<%=new Integer(17)%>"/>
<h1 style = "color:green"><%=person.getName()%></h1>
<h1 style = "color:red"><%=person.getAge()%></h1>
