package ServletDemoTest;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
public class ServletDemo2 extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException
    {
        response.setHeader("Location","ServletDemo/WebContent/next.jsp");
        PrintWriter out = response.getWriter();
        out.write("This is deafult page.\n");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException
    {
        doGet(request,response);
    }
}
