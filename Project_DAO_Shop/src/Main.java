import Daos.CustomerDao;
import models.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {

        CustomerDao customer = new CustomerDao();

//        customer.save(new Customer("mohsen","alikhani","09124325465"));
//        customer.save(new Customer("reza","tabibian","09112345433"));
//        customer.save(new Customer("mohammad","bagherzadeh","09144356543"));
//        customer.save(new Customer("ahmad","baghbeigi","09145432321"));

//        customer.update(new Customer(4,"sara","rezaeian","09125431234"));

//        System.out.println(customer.getAll());

//        System.out.println(customer.search(3));
//        customer.delete(new Customer(3,"mohammad","bagherzadeh","09144356543"));

          customer.deleteByNumberId(4);


//        Connection con=null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url="jdbc:mysql://localhost/dbShop2";
//            String user="root";
//            String password="2679650";
//            con = DriverManager.getConnection(url,user,password);
//            Statement stat = con.createStatement();
//            String sql="create database dbShop2";
//            stat.executeUpdate(sql);
//            String tableCustomer="create TABLE t_customer(customerCode INT NOT NULL PRIMARY KEY AUTO_INCREMENT," +
//                    "name VARCHAR(20) NOT NULL,family VARCHAR(30) NOT NULL,mobileNumber VARCHAR(15) NOT NULL)";
//            String tableProduct="create TABLE t_product(productCode INT NOT NULL PRIMARY KEY AUTO_INCREMENT," +
//                    "name VARCHAR(20) NOT NULL,price DECIMAL(4,2) NOT NULL)";
//            PreparedStatement ps=con.prepareStatement(tableProduct);
//            ps.executeUpdate();
//            System.out.println("create successfully!!!!");
//            con.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}