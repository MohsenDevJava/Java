package CourseJavaSE.ObjectClass;

public class MainClass {

    public static void main(String[] args) {

        Person person1 = new Person(1,"mohsen","alikhani");
        Person person2 = new Person(2,"reza","tavakoli");
        Person person3 = person1;

        System.out.println(person1);
        System.out.println(person3);
        person3.setFamily("ahmadi");
        System.out.println(person1);
        System.out.println(person3);
    }
}
