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
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html;charset = UTF-8");
        try
        {
            connection = JdbcUtil.getConnection();
            String sql = "insert into user(name,money)value(?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"littleBrother");
            statement.setInt(2,1000);
            statement.executeUpdate();
            resultSet = statement.executeQuery("select * from user");
            while (resultSet.next())
            {
                pw.write("name:" + (String)resultSet.getObject("name") + " money:"
                + (int)resultSet.getObject("money") + "<br />");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            try {
                pw.close();
                JdbcUtil.release(connection, statement, resultSet);
            }catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException
    {
        doGet(request,response);
    }
}
