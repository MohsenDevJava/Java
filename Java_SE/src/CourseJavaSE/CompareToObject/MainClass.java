package CourseJavaSE.CompareToObject;

public class MainClass {

    public static void main(String[] args) {

        Person p1 = new Person(1,"mehdi",23);
        Person p2 = new Person(2,"hassan",44);

        System.out.println(p1.compareTo(p2));
    }
}
