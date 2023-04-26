package CourseJavaSE.ListMethod;

import java.util.*;
import java.util.Comparator;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<String> list1= new ArrayList<>();
        list1.add("mehdi");
        list1.add("mohsen");
        list1.add("zahra");
        list1.add("hossein");
        list1.add("ghazal");
        list1.add("asal");
        list1.add("mehdi");
//        List<String> list2=new ArrayList<>(Arrays.asList("zahra","maman","nane"));
//        List<String> list3=new ArrayList<>(500000);

        //*****List Methods*****

//        System.out.println(list1.get(2));
//        list1.set(3,"$$$");
//        System.out.println(list1);
//        System.out.println(list1.indexOf("mehdi"));
//        System.out.println(list1.lastIndexOf("mehdi"));
//        list1.sort(Comparator.naturalOrder());
//
//        System.out.println(list1);
//

        List<Person> people = new ArrayList<>();
        people.add(new Person(1,"mohsen","alikhani",36));
        people.add(new Person(2,"reza","tabatabaei",23));
        people.add(new Person(3,"mohammad","gholami",12));
        people.add(new Person(4,"baran","kosari",42));

        people.sort(Comparator.naturalOrder());

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println("---------------------------------------");
        people.sort(Comparator.reverseOrder());

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}
