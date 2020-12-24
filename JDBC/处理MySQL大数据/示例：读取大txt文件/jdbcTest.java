package JDBC;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest
{
    public static void main(String args[]) throws IOException, SQLException {
        String insertSql = "insert into testtable(resume) value(?)";
        String readSql = "select resume from testtable where id=1";
        //insert(insertSql);
        read(readSql);
    }
    public static void insert(String sql) throws SQLException, IOException {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement st = connection.prepareStatement(sql);
        String path = JdbcTest.class.getClassLoader().getResource("data.txt").getPath();
        path = path.replaceAll("%20"," ");
       File file = new File(path);
       FileReader reader = new FileReader(file);
       st.setCharacterStream(1,reader,file.length());
       if (st.executeUpdate() > 0)
           System.out.println("insert success.");
       reader.close();
       JdbcUtil.release(connection,st,null);
    }
    public static void read(String sql) throws SQLException, IOException {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        StringBuffer content = new StringBuffer();
        while (rs.next())
        {
            Reader reader = rs.getCharacterStream("resume");
            char buffer[] = new char[1024];
            int len = 0;
            FileWriter fw = new FileWriter("F://data.txt");
            while ((len = reader.read(buffer)) > 0)
            {
                content.append(new String(buffer));
                fw.write(buffer,0,len);
            }
            fw.close();
            reader.close();
        }
        System.out.println(content.toString());
        JdbcUtil.release(connection,st,rs);
    }
}
