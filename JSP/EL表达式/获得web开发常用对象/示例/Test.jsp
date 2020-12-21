<%@ page language = "java" pageEncoding = "UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        <%
            pageContext.setAttribute("name","name1");
            request.setAttribute("name","name2");
            session.setAttribute("name","name3");
            application.setAttribute("name","name4");
        %>
        <hr />
        <h3 style = "color:green;">${pageScope.name}</h3>
        <h3 style = "color:green;">${requestScope.name}</h3>
        <h3 style = "color:green;">${sessionScope.name}</h3>
        <h3 style = "color:green;">${applicationScope.name}<hr /></h3>
        <h3 style = "color:blue;">${param.name}<hr /></h3>
        <form action = "${pageContext.request.contextPath}/test" method = "post">
            <input type = "text" name = "username" value = "${param.name}"/>
            <input type = "submit" value = "sign up"/>
        </form>
        <hr />
        <h3 style = "color:blue;">${paramValue.like[0]}</h3>
        <h3 style = "color:blue;">${paramValue.like[1]}<hr /></h3>
        <h3 style = "color:red;">${header.Accept}</h3>
        <h3 style = "color:red;">${header["Accept-Encoding"]}</h3>
        <h3 style = "color:red;">${headerValues.Accept[0]}</h3>
        <h3 style = "color:red;">${headerValues["Accept-Encoding"][0]}</h3>
        <h3 style = "color:black;">${initParam.name}</h3>
        <h3 style = "color:black;">${initParam.root}<hr /></h3>
    </body>
</html>
