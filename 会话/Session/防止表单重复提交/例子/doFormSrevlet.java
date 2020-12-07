package ServletDemoTest;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DoFormServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        request.setCharacterEncoding("UTF-8");
        String user = request.getParameter("username");
        try
        {
            Thread.sleep(3 * 1000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(user);
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        doGet(request,response);
    }
}
