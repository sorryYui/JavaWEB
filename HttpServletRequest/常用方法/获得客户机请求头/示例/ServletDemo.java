package ServletDemoTest;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.util.Enumeration;
public class ServletDemo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        response.setHeader("content-type","text/html;charset = UTF-8");
        PrintWriter out = response.getWriter();
        Enumeration<String> eInfo = request.getHeaderNames();
        out.write("所有请求头：" + "<hr />");
        while (eInfo.hasMoreElements())
        {
            String headName = eInfo.nextElement();
            String headValue = request.getHeader(headName);
            out.write(headName + ":" + headValue + "<br />");
        }
        out.write("Accept-Encoding:<hr />");
        out.write(request.getHeader("accept-encoding") + "<br />");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        doGet(request,response);
    }

}
