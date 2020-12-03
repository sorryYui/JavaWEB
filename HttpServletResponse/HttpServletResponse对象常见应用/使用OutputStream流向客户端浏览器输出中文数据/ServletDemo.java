package ServletDemoTest;
import java.io.OutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
public class ServletDemo extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException
    {
        String data = "弟弟";
        OutputStream output = response.getOutputStream();
        response.setHeader("content-type","text/html;charset = UTF-8");
        output.write(data.getBytes("UTF-8"));
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException
    {
        doGet(request,response);
    }
}
