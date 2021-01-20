package ServletDemoTest;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
public class Test extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        String username = request.getParameter("username");
        String method = request.getMethod();
        PrintWriter pw = response.getWriter();
        pw.write("method:" + method + "<br/>");
        pw.write("value:" + username + "<br />");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        doGet(request,response);
    }
}
