package CourseJavaSE.Iterable;

import java.util.Iterator;

public class MainClass {

    public static void main(String[] args) {

//        List<Integer> list1= new ArrayList<>();
//        list1.add(23);
//        list1.add(210);
//        list1.add(2222);
//        list1.add(340);
//        list1.add(565);
//        list1.add(896);
//        list1.add(3231);
//
//        list1.forEach(item-> System.out.print(item+" "));
//
//        System.out.println();
//
//        Iterator<Integer> iterator=list1.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }
//        System.out.println();
//        List<String> nameList=new ArrayList<>();
//        nameList.add("mehdi");
//        nameList.add("mohsen");
//        nameList.add("ali");
//        nameList.add("reza");
//        nameList.add("mohammad");
//
//        nameList.forEach(name-> System.out.print(name + " "));
//
//        System.out.println();
//
//        Iterator<String> iterator1 = nameList.iterator();
//        while (iterator1.hasNext()){
//            System.out.print(iterator1.next()+" ");
//        }
//
//        String[]  listNam={"gholi","gholeidoon","kian","kamran"};
//        List<String> Lname=Arrays.asList(listNam);
//        Lname.forEach(name-> System.out.println(name));
//
//        Iterator iterator2 = Lname.iterator();
//        while (iterator2.hasNext()){
//            System.out.println(iterator2.next());
//        }

        Person[] people=new Person[3];
        people[0]=new Person(1,"mohsen","alikhani");
        people[1]=new Person(2,"ali","rezvani");
        people[2]=new Person(3,"hamid","bagheri");

        Persons persons = new Persons(people);
        persons.forEach(name-> System.out.println(name));
        System.out.println("------------------------------");
        Iterator<Person> iterator1= persons.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
