package JDBC;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class JdbcTest
{
    public static void main(String args[]) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        String sql1 = "insert into user(id,name,password)value(1,'zhangsan','123456')";
        String sql2 = "insert into user(id,name,password)value(2,'lisi','123456')";
        String sql3 = "update user set password = '1234567' where id = 1";
        String sql4 = "delete from user where id = 2";
        String sql5 = "select * from user";
        Statement st = connection.createStatement();
        st.addBatch(sql1);
        st.addBatch(sql2);
        st.addBatch(sql3);
        st.addBatch(sql4);
        st.executeBatch();
        st.clearBatch();
        ResultSet rt = st.executeQuery(sql5);
        while (rt.next())
        {
            String name = (String)rt.getObject("name",String.class);
            String password = (String)rt.getObject("password",String.class);
            System.out.println(name + " " + password);
        }
        JdbcUtil.release(connection,st,rt);
    }
}
