import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
public class ServletDemo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        request.setCharacterEncoding("UTF-8");
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        String htmlStr = "<table>" + "<tr><td>编号:</td><td>{0}</td></tr>" +
                "<tr><td>名字:</td><td>{1}</td></tr>" + "</table>";
        htmlStr = MessageFormat.format(htmlStr,userId,userName);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset = UTF-8");
        response.getWriter().write(htmlStr);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        doGet(request,response);
    }

}
