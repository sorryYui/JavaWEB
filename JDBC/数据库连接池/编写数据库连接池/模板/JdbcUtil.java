package JDBC;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
public class JdbcUtil
{
    private static JdbcPool pool = new JdbcPool();
    public static Connection getConnection()
    {
        return pool.getConnection();
    }
    public static void release(Connection connection,Statement statement,ResultSet resultSet)
            throws SQLException
    {
        statement.close();
        resultSet.close();
        connection.close();
    }
}
