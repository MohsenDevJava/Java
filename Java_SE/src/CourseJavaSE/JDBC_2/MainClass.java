package CourseJavaSE.JDBC_2;
import java.sql.*;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Connection connect = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/dbtest1";
            String user="root";
            String password="2679650";
            connect=DriverManager.getConnection(url,user,password);
//            Statement statement = connect.createStatement();
//            String sql = "insert into t_person(personId,firstName,lastName,age,average)" +
//                    " values(11,'majid','rahmani',23,14.55)";
//            int resualt = statement.executeUpdate(sql);
//            System.out.println(resualt);
//            String sql="delete from t_person where personId=11";
//            int resualt=statement.executeUpdate(sql);
//            System.out.println(resualt);
//            String sql = "create Table t_person(personId INT not null primary key," +
//                    "firstName varchar(20) not null,lastName varchar(30) not null," +
//                    "age INT not null,avg decimal(4,2) not null)";
//            String inSql="insert INTO t_person(personId,firstName,lastName,age,avg) " +
//                    "values(1,'mohsen','alikhani','35',18.55)";
//            String inSql1="insert INTO t_person(personId,firstName,lastName,age,avg)" +
//                    "values(2,'behnam','vafaei',18,15.33)";
//            String insql2="insert INTO t_person(personId,firstName,lastName,age,avg)" +
//                    "values(3,'reza','farahani',18,16.46)";
//            int res = statement.executeUpdate(insql2);
//            System.out.println(res);

            Scanner reader=new Scanner(System.in);
//                int id = reader.nextInt();
//                String name = reader.next();
//                String family = reader.next();
//                int age=reader.nextInt();
//                float avg=reader.nextFloat();
//              String sql="Insert INTO t_person(personId,firstName,lastName,age,avg) Values(?,?,?,?,?)";
//              PreparedStatement ps= connect.prepareStatement(sql);
//              ps.setInt(1,id);
//              ps.setString(2,name);
//              ps.setString(3,family);
//              ps.setInt(4,age);
//              ps.setFloat(5,avg);
//              int result =ps.executeUpdate();
//            System.out.println(result);
            connect.setAutoCommit(false);
            String sql="select * from t_person";
            PreparedStatement prs = connect.prepareStatement(sql);
            ResultSet result =prs.executeQuery();
            while (result.next()){
                int id =result.getInt("personId");
                String name = result.getString("firstName");
                String family = result.getString("lastName");
                int age = result.getInt("age");
                float avg = result.getFloat("avg");
                System.out.println(id+"\t"+name+"\t"+family+"\t"+age+"\t"+avg);
            }
            connect.commit();
            connect.close();
        } catch (Exception e) {
            System.out.println("error");
            throw new RuntimeException(e);
        }
    }
}
