package CourseJavaSE.ListMethod;

public class Person implements Comparable {

    private int id;
    private String name;
    private String family;
    private int age;

    public Person(int id, String name, String family, int age) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        Person person=(Person) o;
//
//        return this.getFamily().compareTo(person.getFamily());
//    }

    public int compareTo(Object o) {
        Person person=(Person) o;
            if (this.getAge() > person.getAge()){
                return 1;
            } else if (this.getAge()< person.getAge()) {
                return -1;
            }
                return 0;
    }
}
