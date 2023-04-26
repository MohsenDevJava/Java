package CourseJavaSE.Stream_2;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private int personId;
    private String name;
    private int age;

    private double avg;

    public Person(int personId, String name, int age, double avg) {
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", avg=" + avg +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId && age == person.age && Double.compare(person.avg, avg) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, name, age, avg);
    }

    public void setAvg(double avg) {
        this.avg = avg;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person2) {
        if (this.getAge()>person2.getAge())
            return 1;
        else if (this.getAge()<person2.getAge()) {
            return -1;
        }
        return this.getName().compareTo(person2.getName());
    }
}
