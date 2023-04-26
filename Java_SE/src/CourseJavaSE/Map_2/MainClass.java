package CourseJavaSE.Map_2;

import java.util.Iterator;
import java.util.TreeMap;

public class MainClass {

    public static void main(String[] args) {

//        HashMap<String,String> mapColor = new HashMap<String,String>(){{
//            put("R","Red");
//            put("B","Blue");
//            put("G","Green");
//            put("Y","Yellow");
//        }};
//
//        System.out.println(mapColor);

//        for (String key:mapColor.keySet()){
//            System.out.println(key);
//        }
//
//        for (String value:mapColor.values()){
//            System.out.println(value);
//        }

//        System.out.println(mapColor.entrySet());

//        for (Map.Entry<String,String> entry:mapColor.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }

//        Iterator iterator = mapColor.entrySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        TreeMap<Integer,Person> personal = new TreeMap<>(){{
            put(100,new Person(1,"mehdi","alikhani",37));
            put(320,new Person(2,"bahram","gholami",54));
            put(210,new Person(3,"zahra","ahmadi",40));
            put(130,new Person(4,"mahsa","amini",22));
        }};


//        for (Map.Entry<Integer,Person> personEntry:personal.entrySet()){
//            System.out.println(personEntry.getKey()+"==>"+personEntry.getValue().getFamily());
//        }

        Iterator iterator = personal.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
