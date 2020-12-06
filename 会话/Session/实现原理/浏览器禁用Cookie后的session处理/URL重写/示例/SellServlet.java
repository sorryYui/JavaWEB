package ServletDemoTest;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
public class SellServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        String id = request.getParameter("id");
        Book book = DataBase.getAll().get(id);
        HttpSession session = request.getSession();
        List<Book> list = (List)session.getAttribute("list");
       if (list == null)
       {
           list = new ArrayList<Book>();
           session.setAttribute("list",list);
       }
       list.add(book);
       String url = response.encodeRedirectURL(request.getContextPath() + "/table");
       response.sendRedirect(url);
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        doGet(request,response);
    }
}
