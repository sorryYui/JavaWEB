<%@ page language = "java" import = "java.util.*" pageEncoding = "UTF-8"%>
<jsp:useBean id = "calcultor" class = "ServletDemoTest.CalTest"/>
<jsp:setProperty name = "calcultor" property = "*"/>
<%
    calcultor.cal();
%>
<!DOCTYPE HTML>
<html>
    <head>
        <title> Calcultor </title>
    </head>
    <body>
        <jsp:getProperty name = "calcultor" property = "firstNum"/>
        <jsp:getProperty name = "calcultor" property = "operator"/>
        <jsp:getProperty name = "calcultor" property = "secondNum"/>
        =
        <jsp:getProperty name = "calcultor" property = "res"/>
        <br/><hr/><br/>
        <form action = "${pageContext.request.contextPath}/calcultor.jsp" method = "post">
            <table border = "1px">
                <tr>
                    <td colspan = "2">calcultor</td>
                </tr>
                <tr>
                    <td> first number </td>
                    <td><input type = "text" name = "firstNum"></td>
                </tr>
                <tr>
                    <td> operator </td>
                    <td><select name = "operator">
                        <option value = '+'>+</option>
                        <option value = '-'>-</option>
                        <option value = '*'>*</option>
                        <option value = '/'>/</option>
                        </select>
                    </td>
                <tr>
                    <td> second number </td>
                    <td><input type = "text" name = "secondNum"></td>
                </tr>
                <tr>
                    <td colspan = "2"><input type = "submit" value = "cal"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
