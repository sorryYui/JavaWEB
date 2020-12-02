package ServletDemoTest;
import java.io.IOException;
import java.util.Enumeration;
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
       response.setContentType("text/html;charset = UTF-8");
       String paramVal = config.getInitParameter("name");
       response.getWriter().print(paramVal);
       response.getWriter().print("<hr />");
       Enumeration<String> e = config.getInitParameterNames();
       while(e.hasMoreElements())
       {
           String name = e.nextElement();
           String value = config.getInitParameter(name);
           response.getWriter().print(name + "=" + value + "<br />");
       }
   }
   protected void doPost(HttpServletRequest request,HttpServletResponse response)
           throws IOException,ServletException
   {
       doGet(request,response);
   }
   private ServletConfig config;
}
