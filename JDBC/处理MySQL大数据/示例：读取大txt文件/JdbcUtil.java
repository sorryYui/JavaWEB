package JDBC;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Properties;
import java.io.InputStream;
public class JdbcUtil
{
    private static String url;
    private static String username;
    private static String password;
    private static String driver;
    static
    {
        try {
            InputStream in = JdbcUtil.class.getClassLoader().getResourceAsStream("db.properties");
            Properties pro = new Properties();
            pro.load(in);
            url = pro.getProperty("url");
            username = pro.getProperty("username");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
    public static void release(Connection connection,Statement statement,ResultSet resultSet)
    {
        if (resultSet != null)
            try{
                resultSet.close();
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        if (statement != null)
            try{
                statement.close();
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        if (connection != null)
            try{
                connection.close();
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
    }
}
