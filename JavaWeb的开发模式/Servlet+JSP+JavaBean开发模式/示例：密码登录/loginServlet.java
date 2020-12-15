package ServletDemoTest;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class loginServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException
    {
        doPost(request,response);
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException
    {
        String submitFlag = request.getParameter("submitFlag");
        if ("toLogin".equals(submitFlag))
            toLogin(request, response);
        else if ("login".equals(submitFlag))
            login(request,response);
        else
            toLogin(request,response);
    }
    private void toLogin(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        request.getRequestDispatcher("/toLogin.jsp").forward(request,response);
    }
    private void login(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        UserBean user = new UserBean();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user.setPassword(password);
        user.setUsername(username);
        if (user.login())
            response.sendRedirect("success.jsp");
        else
        {
            request.setAttribute("user",user);
            toLogin(request,response);
        }
    }
}
