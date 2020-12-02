package ServletDemoTest;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;
public class ServletDemo extends HttpServlet
{
   public void init(ServletConfig config)
           throws ServletException
   {
       this.config = config;
   }
   protected void doGet(HttpServletRequest request,HttpServletResponse response)
           throws IOException,ServletException
   {
       ServletContext context = config.getServletContext();
       String data = "<h1><font color = 'red'> HHHHHHH </font></h1>";
       response.getOutputStream().write(data.getBytes());
       RequestDispatcher rd = context.getRequestDispatcher("/deafultPage");
       rd.forward(request,response);
   }
   protected void doPost(HttpServletRequest request,HttpServletResponse response)
           throws IOException,ServletException
   {
       doGet(request,response);
   }
   private ServletConfig config;
}
