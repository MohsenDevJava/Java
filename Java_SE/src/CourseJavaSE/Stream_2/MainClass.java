package CourseJavaSE.Stream_2;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {


        int[] numbers= {12,43,54,66,97,12,5,7,9,11,10,43};

//        System.out.println(Arrays.stream(numbers).sum());
//        System.out.println(Arrays.stream(numbers).min().getAsInt());
//        System.out.println(Arrays.stream(numbers).max().getAsInt());
//        System.out.println(Arrays.stream(numbers).average().getAsDouble());
//        System.out.println(Arrays.stream(numbers).count());

//        List<String> list1 = new ArrayList<>(Arrays.asList("behnam","mahmoud","reza","mohsen","ali","gholamreza"));
//
//        List<String> l2=list1.stream().filter(item->item.length()>3)
//                      .map(item->"%"+item+"%")
//                      .collect(Collectors.toList());
//
//        for (String item:l2){
//            System.out.println(item);
//        }

//        Set<String> setList=new TreeSet<>(Arrays.asList("saman","leila","moein","ebi","dariush","saman","shohre","sasi","soli"));
//        System.out.println(setList);
//        setList.stream().filter(item->item.startsWith("s"))
//                        .map(item->item.replaceFirst("s","S"))
//                        .forEach(item-> System.out.println(item));
//

        ArrayList<Person> arrayList=new ArrayList<>();
        arrayList.add(new Person(1,"mohsen",25,19.75));
        arrayList.add(new Person(2,"reza",12,16.3));
        arrayList.add(new Person(3,"ali",34,12.2));
        arrayList.add(new Person(4,"mohammad",43,17.5));
        arrayList.add(new Person(5,"reza",12,16.3));


        List<Person> people = arrayList.stream()
                .filter(person -> person.getAvg()<18)
                .map(person -> new Person(person.getPersonId(), person.getName(), person.getAge(), person.getAvg()+1))
                .collect(Collectors.toList());
        for (Person persnal:people){
            System.out.println(persnal);
        }

        HashMap<Integer,String> names = new HashMap<>(){{
            put(1,"bolur");
            put(4,"mehdi");
            put(3,"zahra");
            put(2,"gholamreza");
            put(5,"mohsen");
        }};

        names.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(entry-> System.out.println(entry.getKey()+" : "+entry.getValue()));

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(32,43,221,32,87,25,90,21,43,65,27));

        int sum = numList.stream().filter(num->num%2==0).reduce(0,(x,y)->x+y);
        System.out.println(sum);

        int mul = numList.stream().filter(t->t.toString().startsWith("2")).reduce(1,(x,y)->x*y);
        System.out.println(mul);


    }
}
