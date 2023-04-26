package CourseJavaSE.DaoStructure.daos;



import CourseJavaSE.DaoStructure.models.Customer;
import CourseJavaSE.DaoStructure.models.SqlConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerDao implements Dao<Customer>{

    Connection conn;

    public CustomerDao() {
        this.conn = new SqlConnector().getConn();
    }

    @Override
    public void save(Customer customer) throws Exception {

        String sql="insert INTO t_customer(name,family,mobileNumber)" +
                "values(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,customer.getName());
        ps.setString(2,customer.getFamily());
        ps.setString(3,customer.getMobileNumber());
        ps.executeUpdate();
        conn.commit();
    }

    @Override
    public List<Customer> getAll() throws Exception {
        List<Customer> customers = new ArrayList<>();
        String sql="Select * from t_customer";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet result = ps.executeQuery();
        while (result.next()){
            int customerCode = result.getInt("customerCode");
            String name = result.getString("name");
            String family = result.getString("family");
            String mobileNumber = result.getString("mobileNumber");

            customers.add(new Customer(customerCode,name,family,mobileNumber));

        }
        return customers;
    }

    @Override
    public Optional<Customer> search(long id) throws Exception {
        String sql="select * from t_customer where customerCode=? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setLong(1,id);
        ResultSet result = ps.executeQuery();
        while (result.next()){
            int customerCode = result.getInt("customerCode");
            String name = result.getString("name");
            String family = result.getString("family");
            String mobileNumber = result.getString("mobileNumber");

            return Optional.of(new Customer(customerCode,name,family,mobileNumber));
        }
        return Optional.empty();
    }

    @Override
    public void update(Customer customer) throws Exception {

        String sql="update t_customer set name=?,family=?,phoneNumber=? where customerCode=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,customer.getName());
        ps.setString(2, customer.getFamily());
        ps.setString(3, customer.getMobileNumber());
        ps.executeUpdate();
        conn.commit();
    }

    @Override
    public void delete(Customer customer) throws Exception {
        String sql="delete from t_customer where customerCode=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,customer.getCustomerCode());
        ps.executeUpdate();
        conn.commit();
    }

    @Override
    public void deleteByCode(long code) throws Exception {
        String sql="delete from t_customer where customerCode=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setLong(1, code);
        ps.executeUpdate();
        conn.commit();
    }


}
