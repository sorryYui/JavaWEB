package ServletDemoTest;
import javax.naming.Context;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class JdbcUtilTest extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException
    {
        try
        {
            Connection connection = JdbcUtil.getConnection();
            DatabaseMetaData dbmd = connection.getMetaData();
            System.out.println(dbmd.getURL());
            System.out.println(dbmd.getUserName());
            System.out.println(dbmd.getDatabaseProductName());
            System.out.println(dbmd.getDatabaseProductVersion());
            System.out.println(dbmd.getDriverName());
            System.out.println(dbmd.getDriverVersion());
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException
    {
        doGet(request,response);
    }
}
