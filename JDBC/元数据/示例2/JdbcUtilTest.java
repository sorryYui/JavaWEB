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
            PreparedStatement ps = connection.prepareStatement("select * from user");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rm = rs.getMetaData();
            System.out.println(rm.getColumnCount());
            System.out.println(rm.getColumnName(1));
            System.out.println(rm.getColumnTypeName(2));
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
