package ServletDemoTest;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
public class ServletDemo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        String data = "This is next,HHHHHHH";
        request.setAttribute("data",data);
        RequestDispatcher red = request.getRequestDispatcher("/next.jsp");
        red.forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        doGet(request,response);
    }

}
