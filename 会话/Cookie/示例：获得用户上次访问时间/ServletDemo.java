package ServletDemoTest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
public class ServletDemo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset = UTF-8");
        PrintWriter out = response.getWriter();
        Cookie []cookie = request.getCookies();
        if (cookie != null)
            for (int i = 0;i < cookie.length;i++)
                if (cookie[i].getName().equals("lastAccessTime"))
                {
                    Long lastAccessTime = Long.parseLong(cookie[i].getValue());
                    Date date = new Date(lastAccessTime);
                    out.write(date.toString() + "<br/>");
                }
        if (cookie == null)
            out.write("Your are first enter the page.<br />");
        Cookie ck = new Cookie("lastAccessTime",System.currentTimeMillis() + "");
        response.addCookie(ck);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        doGet(request,response);
    }

}

