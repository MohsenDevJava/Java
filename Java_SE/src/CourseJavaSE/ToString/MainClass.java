package CourseJavaSE.ToString;

public class MainClass {
    public static void main(String[] args) {

        Person person1 = new Person(1,"mohsen","alikhani");
        Person person2 = new Person(2,"reza","tavakoli");
        Person person3 = new Person(3,"mohammad","khodabakhsh");

        Person[] people = {person1,person2,person3};

//        for (int i = 0; i <people.length ; i++) {
//            System.out.println(people[i]);
//        }

        for (Person item: people) {
            System.out.println(item);
        }
    }
}
