package ServletDemoTest;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
public class ServletDemo extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException
    {
        response.sendRedirect("/index.html");
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException
    {
        doGet(request,response);
    }
}
