<%@page contentType = "text/html;charset = UTF-8"%>
<%@page import = "java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title sytle = "color:red;"> Form </title>
    </head>
    <%
        pageContext.setAttribute("name1","HHH");
        request.setAttribute("name2","HHHH");
        session.setAttribute("name3","HHHHH");
        application.setAttribute("name4","HHHHHH");
    %>
    <%
        String name1 = (String)pageContext.findAttribute("name1");
        String name2 = (String)pageContext.findAttribute("name2");
        String name3 = (String)pageContext.findAttribute("name3");
        String name4 = (String)pageContext.findAttribute("name4");
        String name5 = (String)pageContext.findAttribute("name5");
    %>
    <body>
        <h1> name1 = <%= name1%> <br /></h1>
        <h1> name2 = <%= name2%> <br /></h1>
        <h1> name3 = <%= name3%> <br /></h1>
        <h1> name4 = <%= name4%> <br /></h1>
        <h1> name5 = <%= name5%> <br /></h1>
    </body>
</html>
