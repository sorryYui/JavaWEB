<%@ page language = "java" pageEncoding = "UTF-8"%>
<%@taglib uri = "/ServletDemoTest" prefix = "xdp"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        <%
            String ip = request.getRemoteAddr();
            out.write(ip);
        %>
        <hr/>
        Your IP:
        <xdp:IP/>
    </body>
</html>
