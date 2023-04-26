import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class Main {
    public static void main(String[] args) {
        int f =1,i=2;
        while (++i<5){
            f*=i;
        }
        System.out.println(f);

//        Connection connect = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
////          String creatdb="jdbc:mysql://localhost/";
//            String url ="jdbc:mysql://localhost:3306/dbshop";
//            String user="root";
//            String password = "2679650";
//            connect = DriverManager.getConnection(url,user,password);
//            connect.setAutoCommit(false);
//            Statement stat = connect.createStatement();
////          String sql ="create database dbShop";
//            String tableCustomer="create Table t_customer(customerCode INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
//                    "name varchar(20) not null,family varchar(20) not null," +
//                    "mobileNumber varchar(15) not null)";
//            String tableProduct="create Table t_product(productCode INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
//                    "productName varchar(200) not null,price DECIMAL(4,2) not null)";
////            stat.executeUpdate(tableCustomer);
//            String[] allCommand ={tableCustomer,tableProduct};
//            for (String command:allCommand){
//                stat.executeUpdate(command);
//            }
//            System.out.println("Operation done successfully!!!");
//            connect.commit();
//            connect.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
    }
}