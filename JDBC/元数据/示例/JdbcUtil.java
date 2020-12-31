package ServletDemoTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcUtil {
    private static DataSource dataSource;

    public JdbcUtil() {
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void release(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if (statement != null) {
            statement.close();
        }

        if (resultSet != null) {
            resultSet.close();
        }

        if (connection != null) {
            connection.close();
        }

    }

    static {
        try {
            Context initCtx = new InitialContext();
            Context envctx = (Context)initCtx.lookup("java:comp/env");
            dataSource = (DataSource)envctx.lookup("jdbc/datasource");
        } catch (Exception var2) {
            throw new ExceptionInInitializerError(var2);
        }
    }
}
