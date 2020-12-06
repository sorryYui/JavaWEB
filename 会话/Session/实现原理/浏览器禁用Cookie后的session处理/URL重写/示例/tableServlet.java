package ServletDemoTest;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class tableServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        response.setContentType("text/html;charset = UTF-8");
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        List<Book> list = (List)session.getAttribute("list");
        if (list == null || list.size() == 0)
        {
            out.write("No book. <br />");
            return;
        }
        for (Book book : list)
            out.write(book.getName() + "<br />");
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        doGet(request,response);
    }
}
