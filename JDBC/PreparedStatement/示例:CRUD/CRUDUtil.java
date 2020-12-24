package JDBC;
import java.sql.*;
import java.util.Properties;
import java.io.InputStream;
public class CRUDUtil
{
    private static String username;
    private static String url;
    private static String driver;
    private static String password;
    static {
        try {
            InputStream in = CRUDUtil.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(in);
            username = properties.getProperty("username");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
            password = properties.getProperty("password");
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
        throws SQLException
    {
        return DriverManager.getConnection(url,username,password);
    }
    public static void release(Connection connection, Statement statement, ResultSet resultSet)
    {
        if (resultSet != null)
            try
            {
                resultSet.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        if (statement != null)
            try
            {
                statement.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        if (connection != null)
            try
            {
                connection.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
    }
}
