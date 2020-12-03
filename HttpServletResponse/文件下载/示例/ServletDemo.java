package ServletDemoTest;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.InputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
public class ServletDemo extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException,FileNotFoundException
    {
        download(response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException,FileNotFoundException
    {
        doGet(request,response);
    }
    private void download(HttpServletResponse response)
            throws FileNotFoundException,ServletException,IOException
    {
        ServletContext context = this.getServletContext();
        String realpath = context.getRealPath("/Download/1.jpg");
        System.out.println(realpath);
        String filename = realpath.substring(realpath.lastIndexOf("\\") + 1);
        response.setHeader("content-disposition","attachment;filename = " + filename);
        InputStream input = new FileInputStream(realpath);
        int len = 0;
        byte[] buffer = new byte[1024];
        OutputStream output = response.getOutputStream();
        while((len = input.read(buffer)) > 0)
            output.write(buffer,0,len);
        input.close();
        output.close();
    }
}
