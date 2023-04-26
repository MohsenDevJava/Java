package CourseJavaSE.DaoStructure.models;

public class Products {

    private int productCode;
    private String productName;
    private double price;

    public Products(int productCode, String productName, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    public Products() {
    }

    public Products(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
