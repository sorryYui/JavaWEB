package ServletDemoTest;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
       String contextInitParam = context.getInitParameter("url");
       response.getWriter().write(contextInitParam);
   }
   protected void doPost(HttpServletRequest request,HttpServletResponse response)
           throws IOException,ServletException
   {
       doGet(request,response);
   }
   private ServletConfig config;
}
