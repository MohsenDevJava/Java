package CourseJavaSE.Reflection;

import CourseJavaSE.CustomAnnotation.MyAnnotation;

@MyAnnotation
public class Person {

    private int personId;
    private String name;
    private String family;
    private int age;

    public Person(int personId, String name, String family, int age) {
        this.personId = personId;
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }

    class inner{
        int x;
        public void showX(){
            System.out.println(x);
        }
    }

    class inner1{

        public void printed(){
            System.out.println("printed");
        }
    }
}
