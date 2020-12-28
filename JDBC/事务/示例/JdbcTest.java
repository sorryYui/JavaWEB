package JDBC;
import java.sql.*;

public class JdbcTest
{
    public static void main(String args[]) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        String sql = "insert into user(name,money)value(?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        for (char ch = 'A';ch <= 'C';ch++)
        {
            st.setString(1,ch + "");
            st.setInt(2,1000);
            st.addBatch();
        }
        st.executeBatch();
        st.clearBatch();
        connection.setAutoCommit(false);
        String sql1 = "update user set  money = money - 100 where name = 'A'";
        String sql2 = "update user set money = money + 100 where name = 'B'";
        st.executeUpdate(sql1);
        st.executeUpdate(sql2);
        connection.commit();
        JdbcUtil.release(connection,st,null);
    }
}
