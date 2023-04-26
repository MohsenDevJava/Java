package CourseJavaSE.Map_2;

import java.util.Objects;

public class Person implements Comparable {

    private int PersonId;
    private String name;
    private String family;
    private int age;

    public Person(int personId, String name, String family, int age) {
        PersonId = personId;
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int personId) {
        PersonId = personId;
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
                "PersonId=" + PersonId +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return PersonId == person.PersonId && age == person.age && Objects.equals(name, person.name) && Objects.equals(family, person.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PersonId, name, family, age);
    }

    @Override
    public int compareTo(Object o) {
        Person person2=(Person) o;
        return person2.compareTo(((Person) o).getFamily());
    }
}
