package models;

public class Customer {

    private int customerCode;
    private String name;
    private String family;
    private String mobileNumber;

    public Customer(int customerCode, String name, String family, String mobileNumber) {
        this.customerCode = customerCode;
        this.name = name;
        this.family = family;
        this.mobileNumber = mobileNumber;
    }

    public Customer() {
    }

    public Customer(String name, String family, String mobileNumber) {
        this.name = name;
        this.family = family;
        this.mobileNumber = mobileNumber;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode=" + customerCode +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
