package CourseJavaSE.Equals;


public class MainClass {

    public static void main(String[] args) {

    Person person1 = new Person(1,"mohsen","alikhani");
    Person person2 = new Person(2,"mohammad","ansari");
    Person person3 = new Person(2,"mohammad","ansari");


        System.out.println(person1.equals(null));
        System.out.println(person1.equals(person1));
        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));
    }

}
