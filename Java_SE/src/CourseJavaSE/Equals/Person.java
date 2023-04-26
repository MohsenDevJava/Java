package CourseJavaSE.Equals;

import java.util.Objects;

public class Person {
    private int personId;
    private  String firstName;
    private  String lastName;

    public Person(int personId, String firstName, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person persons = (Person) o;
        return personId == persons.personId && Objects.equals(firstName, persons.firstName) && Objects.equals(lastName, persons.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, firstName, lastName);
    }
}
