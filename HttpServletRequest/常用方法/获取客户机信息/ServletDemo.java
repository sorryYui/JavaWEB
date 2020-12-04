package ServletDemoTest;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
public class ServletDemo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        String requestURL = request.getRequestURL().toString();
        String requestURI = request.getRequestURI().toString();
        String query = request.getQueryString();
        String remoteAddr = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();
        int remotePort = request.getRemotePort();
        String remoteUser = request.getRemoteUser();
        String method = request.getMethod();
        String pathInfo = request.getPathInfo();
        String localAddr = request.getLocalAddr();
        String localName = request.getLocalName();
        response.setHeader("content-type","text/html;charset = UTF-8");
        PrintWriter pw = response.getWriter();
        pw.write("获取到的客户机信息如下：" + "<hr />");
        pw.write("URL:" + requestURL + "<br />");
        pw.write("URI:" + requestURI + "<br />");
        pw.write("query:" + query + "<br />");
        pw.write("IP:" + remoteAddr + "<br />");
        pw.write("Hostname:" + remoteHost + "<br />");
        pw.write("Port:" + remotePort + "<br />");
        pw.write("User:" + remoteUser + "<br />");
        pw.write("pathInfo:" + pathInfo + "<br />");
        pw.write("localAddr:" + localAddr + "<br />");
        pw.write("localName" + localName + "<br />");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        doPost(request,response);
    }

}
