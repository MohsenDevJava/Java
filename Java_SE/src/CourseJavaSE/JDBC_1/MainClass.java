package CourseJavaSE.JDBC_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainClass {

    public static void main(String[] args) {

        Connection conect = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dbtest";
            String user = "root";
            String password="2679650";
            conect=DriverManager.getConnection(url,user,password);
            Statement statement = conect.createStatement();
//            statement.executeQuery("");
//            String sql ="Create Database dbtest1";
//            int result = statement.executeUpdate(sql);
            String sql=" Create Table t_user(id INT not null Primary key" +
                    ",name varchar(20) not null)";
            int result = statement.executeUpdate(sql);
            System.out.println(result);
            conect.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
