package JDBC;
import java.io.*;
import java.sql.*;

public class JdbcTest
{
    public static void main(String args[]) throws IOException, SQLException {
        String insertSql = "insert into bytetest(image)value(?)";
        String readSql = "select * from bytetest";
        insert(insertSql);
        read(readSql);
    }
    public static void insert(String sql) throws SQLException, IOException {
        Connection con = JdbcUtil.getConnection();
        PreparedStatement st = con.prepareStatement(sql);
        for (int i = 1;i <= 2;i++)
        {
            String path = JdbcTest.class.getClassLoader().getResource(i + ".jpg").getPath();
            path = path.replaceAll("%20"," ");
            File file = new File(path);
            FileInputStream in = new FileInputStream(file);
            st.setBinaryStream(1,in,(int)file.length());
            if (st.executeUpdate() > 0)
                System.out.println("insert success.");
            in.close();
        }
        JdbcUtil.release(con,st,null);
    }
    public static void read(String sql) throws SQLException, IOException {
        Connection con = JdbcUtil.getConnection();
        PreparedStatement st = con.prepareStatement(sql);
        ResultSet rt = st.executeQuery();
        int cnt = 0;
        while (rt.next())
        {
            InputStream in = rt.getBinaryStream("image");
            byte buffer[] = new byte[1024];
            int len = 0;
            FileOutputStream out = new FileOutputStream("F://" + cnt++ + ".jpg");
            while ((len = in.read(buffer)) > 0)
                out.write(buffer,0,len);
            in.close();
            out.close();
        }
        JdbcUtil.release(con,st,rt);
    }
}
