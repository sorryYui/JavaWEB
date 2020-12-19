<%@ page language = "java" import = "java.util.*" pageEncoding = "UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<jsp:useBean id = "person" class = "ServletDemoTest.PersonBean"/>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Test</title>
    </head>
    <c:set var = "data1" value = "element1" scope = "page"/>
    <c:set var = "data2" scope = "request"> element2 </c:set>
    <c:set var = "data3" scope = "session"> element3 </c:set>
    <c:set var = "data4" scope = "application"> element4 </c:set>
    <c:set target = "${person}" property = "age">19</c:set>
    <c:set target = "${person}" property = "name">HHH</c:set>
    <c:set target = "${person}" property = "country">China</c:set>
    <body>
            <ul>
                <li><c:out value = "${pageScope.data1}"/></li>
                <li><c:out value = "${requestScope.data2}"/></li>
                <li><c:out value = "${sessionScope.data3}"/></li>
                <li><c:out value = "${applicationScope.data4}"/></li>
            </ul>
            <hr/>
            <ul>
                <li><c:out value = "${person.name}"/></li>
                <li><c:out value = "${person.age}"/></li>
                <li><c:out value = "${person.country}"/></li>
            </ul>
        </body>
</html>
