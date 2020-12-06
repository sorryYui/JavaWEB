package ServletDemoTest;
import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class indexServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        request.getSession();
        response.setContentType("text/html;charset = UTF-8");
        PrintWriter out = response.getWriter();
        out.write("这里有以下书: <br/>");
        Set<Map.Entry<String,Book>> set = DataBase.getAll().entrySet();
        System.out.println(set.size());
        for (Map.Entry<String,Book> e : set)
        {
            Book book = e.getValue();
            String url = request.getContextPath() + "/sell?id=" + book.getId();
            url = response.encodeURL(url);
            out.println(book.getName() + "  <a href=\"" + url + "\">Buy</a><br/>");
        }
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        doGet(request,response);
    }
}
