package CourseJavaSE.DaoStructure.daos;

import CourseJavaSE.DaoStructure.models.Products;
import CourseJavaSE.DaoStructure.models.SqlConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductDao implements Dao<Products>{

    Connection conn;

    public ProductDao() {
        this.conn = new SqlConnector().getConn();
    }

    @Override
    public void save(Products products) throws Exception {
        String sql="INSERT INTO t_product(productName,price) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, products.getProductName());
        ps.setDouble(2,products.getPrice());
        ps.executeUpdate();
        conn.commit();
    }

    @Override
    public List<Products> getAll() throws Exception {
        List<Products> products =new ArrayList<>();
        String sql="select * from t_product";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet result=ps.executeQuery();
        while (result.next()){
            int productCode= result.getInt("productCode");
            String productName = result.getString("productName");
            double price = result.getDouble("price");
            products.add(new Products(productCode,productName,price));
            conn.commit();
        }
        return products;
    }

    @Override
    public Optional<Products> search(long id) throws Exception {
        String sql="select * from t_product where productCode =?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setLong(1,id);
        ResultSet result=ps.executeQuery();
        while (result.next()){
            int productCode = result.getInt("productCode");
            String productName = result.getString("productName");
            double price = result.getDouble("price");
            return Optional.of(new Products(productCode,productName,price));
        }
        return Optional.empty();
    }

    @Override
    public void update(Products products) throws Exception {
        String sql="update t_product set productName=?,price=? where productCode=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, products.getProductName());
        ps.setDouble(2,products.getPrice());
        ps.setInt(3,products.getProductCode());
        ps.execute();
        conn.commit();
    }

    @Override
    public void delete(Products products) throws Exception {
        String sql="delete from t_product where productCode=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,products.getProductCode());
        ps.execute();
        conn.commit();
    }

    public void deleteByCode(long Code) throws Exception {
        String sql="delete from t_product where productCode=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setLong(1,Code);
        ps.execute();
        conn.commit();
    }
}
