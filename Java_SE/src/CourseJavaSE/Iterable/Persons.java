package CourseJavaSE.Iterable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Persons implements Iterable<Person>{

    List list;

    public Persons(Person[] arrayList) {
        this.list = Arrays.asList(arrayList);
    }

    @Override
    public Iterator<Person> iterator() {
        return list.iterator();
    }
}
