package JDBC;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.*;
import java.util.Properties;
import java.io.InputStream;
import javax.sql.DataSource;
import java.util.List;
import java.util.LinkedList;
import java.util.logging.Logger;

public class JdbcPool implements  DataSource
{
    private static List<Connection> list;
    private static String username;
    private static String password;
    private static String url;
    private static String driver;
    private static int initSize;
    static
    {
        InputStream in = JdbcPool.class.getClassLoader().getResourceAsStream("db.properties");
        Properties pro = new Properties();
        try
        {
            pro.load(in);
            list = new LinkedList<Connection>();
            username = pro.getProperty("username");
            password = pro.getProperty("password");
            url = pro.getProperty("url");
            driver = pro.getProperty("driver");
            initSize = Integer.parseInt(pro.getProperty("initSize"));
            Class.forName(driver);
            for (int i = 0;i < initSize;i++)
                list.add(DriverManager.getConnection(url,username,password));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public PrintWriter getLogWriter()
    {
        return null;
    }
    public void setLogWriter(PrintWriter pw)
    {

    }
    public void setLoginTimeout(int second)
        throws SQLException
    {

    }
    public int getLoginTimeout()
        throws SQLException
    {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public ConnectionBuilder createConnectionBuilder() throws SQLException {
        return null;
    }

    public <T> T unwrap(Class<T> iface)
        throws SQLException
    {
        return null;
    }
    public boolean isWrapperFor(Class<?> iface)
        throws SQLException
    {
        return false;
    }
    public Connection getConnection()
    {
        if (list.size() > 0)
        {
            final Connection connection = list.remove(0);
            Connection ret = (Connection) Proxy.newProxyInstance(connection.getClass().getClassLoader(),
                    connection.getClass().getInterfaces(), new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            if (method.getName() != "close")
                                return method.invoke(connection,args);
                            else {
                                list.add(connection);
                                return null;
                            }
                        }
                    });
            return ret;
        }
        else
            throw new RuntimeException();
    }
    public Connection getConnection(String username,String password)
    {
        return null;
    }
}
