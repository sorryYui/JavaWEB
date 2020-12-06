package ServletDemoTest;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ServletDemo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset = UTF-8");
        HttpSession session = request.getSession();
        session.setAttribute("data","HHHHH");
        String sessionId = session.getId();
        if (session.isNew())
            response.getWriter().write("This is new,and ID :" + sessionId + "<br />");
        else
            response.getWriter().write("The session is exitsed,and ID : " + sessionId + "<br />");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        doGet(request,response);
    }

}

