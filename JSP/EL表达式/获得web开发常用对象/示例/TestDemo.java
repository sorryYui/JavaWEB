package ServletDemoTest;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
public class TestDemo extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException
    {
        doPost(request,response);
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException
    {
        String username = request.getParameter("username");
        request.setAttribute("username",username);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Test.jsp");
        requestDispatcher.forward(request,response);
    }
}
