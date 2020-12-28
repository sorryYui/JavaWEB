package JDBC;
import java.sql.*;

public class JdbcTest
{
    public static void main(String args[]) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        String sql = "insert into user(id,name,password)value(?,?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        for (int i = 1;i <= 10086;i++)
        {
            st.setInt(1,i);
            st.setString(2,"index" + i);
            st.setString(3,"123456");
            st.addBatch();
            if (i % 1000 == 0) {
                st.executeBatch();
                st.clearBatch();
            }
        }
        st.executeBatch();
        st.clearBatch();
        JdbcUtil.release(connection,st,null);
    }
}
