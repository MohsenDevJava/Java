package CourseJavaSE.DaoStructure.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnector {
    Connection conn = null;

    public SqlConnector(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/dbshop";
            String user="root";
            String password="2679650";
            conn = DriverManager.getConnection(url,user,password);
            conn.setAutoCommit(false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConn() {
        return conn;
    }
}
