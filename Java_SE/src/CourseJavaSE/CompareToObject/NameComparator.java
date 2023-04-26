package CourseJavaSE.CompareToObject;

import java.util.Comparator;

public class NameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Person person1 = (Person) o1;
        Person person2 = (Person) o2;

        int def = person1.getName().compareTo(person2.getName());
        if (def > 0)
            return 1;
        if (def < 0)
            return -1;
        return 0;
    }
}
