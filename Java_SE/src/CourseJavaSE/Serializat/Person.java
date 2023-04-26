package CourseJavaSE.Serializat;

import java.io.Serializable;

public class Person implements Serializable {
    private int personId;
    private String name;
    private String family;
    private int age;
    transient private double avg;

    private static final long SerialVersionUID = -6841L;

    public Person(int personId, String name, String family, int age, double avg) {
        this.personId = personId;
        this.name = name;
        this.family = family;
        this.age = age;
        this.avg = avg;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", avg=" + avg +
                '}';
    }
}
