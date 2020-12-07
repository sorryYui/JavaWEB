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
        boolean check = isrepeatSubmit(request);
        if (check)
        {
            System.out.println("HHHHH,you submit repeat.");
            return;
        }
        request.getSession().removeAttribute("token");
        System.out.println("OK.");
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        doGet(request,response);
    }
    private boolean isrepeatSubmit(HttpServletRequest request)
    {
        String client_check = request.getParameter("token");
        if (client_check == null)
            return true;
        String session_check = (String)request.getSession().getAttribute("token");
        if (session_check == null)
            return true;
        if (!session_check.equals(client_check))
            return true;
        return false;
    }
    private static final long serialVersionUTD =  -884689940866074733L;

}
