<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@ page import = "java.util.*"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE HTML>
<html>
    <jsp:useBean id = "person" class = "ServletDemoTest.UserBean"/>
    <jsp:setProperty name = "person" property = "sex" value = "man"/>
    <jsp:setProperty name = "person" property = "name" value = "HHHHH"/>
    <head>
        <title>Test</title>
    </head>
    <body>
        <h1>${user == null}</h1>
        <h1>${user eq null}</h1>
        <hr />
        <%
            List<String> list = new ArrayList<String>();
            list.add("data1");
            list.add("data2");
            list.add("data3");
            request.setAttribute("list",list);
        %>
        <c:if test = "${!empty(list)}">
            <c:forEach var = "str" items = "${list}">
                <h3 style = "color:red;">${str}<br /></h3>
            </c:forEach>
        </c:if>
        <%
            List<String> emptyList = new ArrayList<String>();
            request.setAttribute("emptyList",emptyList);
        %>
        <c:if test = "${empty(emptyList)}">
            <h3 style = "color:green"><c:out value = "EMPTY"/></h3>
        </c:if>
    </body>
</html>
