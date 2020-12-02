package ServletDemoTest;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
public class ServletDemo2 extends HttpServlet
{
    public void init(ServletConfig config)
            throws ServletException
    {
        this.config = config;
    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException
    {
        String data = "This is ServletDemo2.";
        response.getOutputStream().write(data.getBytes());
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        doGet(request,response);
    }
    private ServletConfig config;
}
