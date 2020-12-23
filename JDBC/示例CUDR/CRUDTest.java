package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Callable;

public class CRUDTest
{
    public static void main(String args[]) throws SQLException {
        String insertSql = "insert into user(id,name,password,email,birthday)" +
                "value(4,'LaoLiu','123456','4@qq.com','1978-09-23')";
        String deleteSql = "delete from user where id = 3";
        String updateSql = "update user set name = 'JuQi',email = '5@qq.com' where id = 3";
        String findSql = "select * from user where id = 3";
        insert(insertSql);
        find(findSql);
        update(updateSql);
        delete(deleteSql);
    }
    public static void insert(String sql) throws SQLException {
        Connection connection = CRUDUtil.getConnection();
        Statement st = connection.createStatement();
        int num = st.executeUpdate(sql);
        if (num > 0)
            System.out.println("insert success.");
        CRUDUtil.release(connection,st,null);
    }
    public static void delete(String sql) throws SQLException {
        Connection connection = CRUDUtil.getConnection();
        Statement st = connection.createStatement();
        int num = st.executeUpdate(sql);
        if (num > 0)
            System.out.println("delete success.");
        CRUDUtil.release(connection,st,null);
    }
    public static void find(String sql) throws SQLException {
        Connection connection = CRUDUtil.getConnection();
        Statement st = connection.createStatement();
        ResultSet rt = st.executeQuery(sql);
        while (rt.next())
            System.out.println(rt.getString("name"));
        CRUDUtil.release(connection,st,rt);
    }
    public static void update(String sql) throws SQLException {
        Connection connection = CRUDUtil.getConnection();
        Statement st = connection.createStatement();
        if (st.executeUpdate(sql) > 0)
            System.out.println("update success.");
        CRUDUtil.release(connection,st,null);
    }
}
