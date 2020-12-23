package ServletDemoTest;
import java.sql.*;

public class JDBCTest
{
    public static void main(String args[])
            throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbctest?serverTimezone=UTC";
        String name = "root";
        String password = "123qwe456rty";
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,name,password);
        Statement st = connection.createStatement();
        String sql = "select id,name,password,email,birthday from user";
        ResultSet rs = st.executeQuery(sql);
        while (rs.next())
        {
            System.out.println("---------");
            System.out.println("id:" + rs.getObject("id"));
            System.out.println("name:" + rs.getObject("name"));
            System.out.println("password:" + rs.getObject("password"));
            System.out.println("email:" + rs.getObject("email"));
            System.out.println("birthday:" + rs.getObject("birthday"));
        }
        System.out.println("----------");
        rs.close();
        st.close();
        connection.close();
    }
}
