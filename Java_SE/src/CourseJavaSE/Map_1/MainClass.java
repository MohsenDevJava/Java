package CourseJavaSE.Map_1;

import java.util.LinkedHashMap;

public class MainClass {

    public static void main(String[] args) {
//        HashMap<Integer,String> hashMap = new HashMap<Integer,String>(){{
//            put(5,"bahram");
//            put(12,"behnam");
//            put(32,"kian");
//        }};
//        hashMap.put(1,"ahmad");
//        hashMap.put(2,"reza");
//        hashMap.put(3,"ali");
//        hashMap.put(4,"mohammad");
//        hashMap.put(null,"mohsen");
//        hashMap.put(21,null);
//        hashMap.put(43,null);
        LinkedHashMap<Integer,String> linkedHashMap1=new LinkedHashMap<>();

        linkedHashMap1.put(76,"elham");
        linkedHashMap1.put(71,"akram");
        linkedHashMap1.put(60,"sina");
//        System.out.println(hashMap.get(3));
//        System.out.println(hashMap.isEmpty());
//        System.out.println(hashMap.size());
//        System.out.println(hashMap.put(50,"hamed"));
//        System.out.println(hashMap.containsKey(4));
//        System.out.println(hashMap.containsValue("arsham"));
//        System.out.println(hashMap.getOrDefault(9,"****"));
//        System.out.println(hashMap.replace(43,null,"bairam"));
//        System.out.println(hashMap);
//        hashMap.putAll(linkedHashMap1);
//        System.out.println(hashMap);
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put(1,"ahmad");
        linkedHashMap.put(2,"reza");
        linkedHashMap.put(3,"ali");
        linkedHashMap.put(4,"mohammad");
        linkedHashMap.put(null,"mohsen");
        linkedHashMap.put(21,null);
        linkedHashMap.put(43,null);
        linkedHashMap.put(12,"bahram");
        linkedHashMap.put(15,"bayram");
        linkedHashMap.put(32,"amir");
//        System.out.println(linkedHashMap);
//        linkedHashMap.entrySet();
//        System.out.println(linkedHashMap);
        linkedHashMap.forEach((k,v)-> System.out.println(k +"::"+ v));

//        TreeMap<Integer,String> treeMap= new TreeMap<>();
//        treeMap.put(1,"ahmad");
//        treeMap.put(2,"reza");
//        treeMap.put(3,"ali");
//        treeMap.put(4,"mohammad");
//        treeMap.put(null,"mohsen");
//        treeMap.put(21,null);
//        treeMap.put(43,null);
//        treeMap.put(12,"bahram");
//        treeMap.put(15,"bayram");
//        treeMap.put(32,"amir");

//        System.out.println(treeMap);
    }
}
