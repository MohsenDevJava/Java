package CourseJavaSE.Enumeration;

public enum UserType {

    ADMIN("Administrator"),EMPLOYEE("employee"),CUSTOMER("client");

    private String vlaue;
    UserType(String value) {
        this.vlaue = value;
    }

    public String getValue() {
        return vlaue;
    }

    public static UserType defaultUser(){
        return UserType.ADMIN;
    }

}
