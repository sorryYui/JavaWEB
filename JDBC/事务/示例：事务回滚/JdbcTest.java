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
        Savepoint sp = connection.setSavepoint();
        try {
            String sql1 = "update user set  money = money - 100 where name = 'A'";
            String sql2 = "update user set money = money + 100 where name = 'B'";
            int x = 1/0;
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);
        }
        catch(Exception e)
        {
            connection.rollback(sp);
            connection.commit();
            e.printStackTrace();
        }
        JdbcUtil.release(connection,st,null);
    }
}
