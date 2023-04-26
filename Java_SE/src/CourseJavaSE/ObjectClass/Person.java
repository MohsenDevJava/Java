package CourseJavaSE.ObjectClass;

import java.util.Objects;

public class Person implements Cloneable {

    private int personId;
    private String name;
    private String family;

    public Person(int personId, String name, String family) {
        this.personId = personId;
        this.name = name;
        this.family = family;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId && Objects.equals(name, person.name) && Objects.equals(family, person.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, name, family);
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
