package Daos;

import models.Customer;
import models.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerDao implements DAO<Customer>{
    Connection con;

    public CustomerDao() throws Exception {
        this.con = new MyConnection().getConn();
    }


    @Override
    public void save(Customer customer) throws Exception {
        String sql="insert INTO t_customer(name,family,mobileNumber) values(?,?,?)";
        PreparedStatement pre = con.prepareStatement(sql);
        pre.setString(1, customer.getName());
        pre.setString(2, customer.getFamily());
        pre.setString(3,customer.getMobileNumber());
        pre.executeUpdate();
        con.commit();
    }

    @Override
    public void update(Customer customer) throws Exception {
        String sql="update t_customer set name=?,family=?,mobileNumber=? where customerCode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,customer.getName());
        ps.setString(2,customer.getFamily());
        ps.setString(3,customer.getMobileNumber());
        ps.setInt(4,customer.getCustomerCode());
        ps.executeUpdate();
        con.commit();
    }

    @Override
    public void delete(Customer customer) throws Exception {
        String sql="delete from t_customer where customerCode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,customer.getCustomerCode());
        ps.executeUpdate();
        con.commit();
    }

    @Override
    public void deleteByNumberId(long n) throws Exception {
        String sql="delete from t_customer where customerCode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1,n);
        ps.executeUpdate();
        con.commit();
    }

    @Override
    public List<Customer> getAll() throws Exception {
        List<Customer> customers = new ArrayList<>();
        String sql="select * from t_customer";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet result = ps.executeQuery();
        while (result.next()){
            int customerCode = result.getInt("customerCode");
            String name= result.getString("name");
            String family = result.getString("family");
            String mobileNumber = result.getString("mobileNumber");
            customers.add(new Customer(customerCode,name,family,mobileNumber));
        }
        return customers;
    }

    @Override
    public Optional<Customer> search(long id) throws Exception {
        String sql="select * from t_customer where customerCode=?";
        PreparedStatement prs = con.prepareStatement(sql);
        prs.setLong(1,id);
        ResultSet result=prs.executeQuery();
        while (result.next()){
            int customerCode = result.getInt("customerCode");
            String name = result.getString("name");
            String family = result.getString("family");
            String mobileNumber=result.getString("mobileNumber");
            return Optional.of(new Customer(customerCode,name,family,mobileNumber));
        }

        return Optional.empty();
    }
}
