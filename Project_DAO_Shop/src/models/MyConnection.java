package models;
import java.sql.*;

public class MyConnection {

    Connection conn=null;


    public MyConnection() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/dbShop2";
            String user="root";
            String password="2679650";
            conn =DriverManager.getConnection(url,user,password);
            conn.setAutoCommit(false);

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public Connection getConn() {
        return conn;
    }
}
