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
       response.setContentType("text/html;charset = UTF-8");
       StringBuffer paramVal = new StringBuffer(config.getInitParameter("name"));
       response.getWriter().print(paramVal);
       response.getWriter().print("<hr />");
       paramVal.append("<hr />");
       context.setAttribute("data0",paramVal);
       Enumeration<String> e = config.getInitParameterNames();
       int cnt = 0;
       while(e.hasMoreElements())
       {
           String name = e.nextElement();
           String value = config.getInitParameter(name);
           response.getWriter().print(name + "=" + value + "<br />");
           String string = name + "=" + value + "<br />";
           context.setAttribute("data" + ++cnt,string);
       }
   }
   protected void doPost(HttpServletRequest request,HttpServletResponse response)
           throws IOException,ServletException
   {
       doGet(request,response);
   }
   private ServletConfig config;
}
