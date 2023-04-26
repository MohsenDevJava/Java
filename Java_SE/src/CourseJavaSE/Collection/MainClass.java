package CourseJavaSE.Collection;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        List<Integer> integerList= new ArrayList<>();
//        integerList.ensureCapacity();
//        ArrayList<Integer>  arrayList= new ArrayList<>();
//           arrayList.ensureCapacity();
//        LinkedList<Integer> linkedList=new LinkedList<>();
//        Vector<Integer> vector = new Vector<>();
//        Stack<Integer> stack = new Stack<>();
//        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();
//        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
//        HashSet<Integer> hashSet=new HashSet<>();
//        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
//        SortedSet<Integer> sortedSet = new TreeSet<>();

        Collection<Integer> arrayList=new ArrayList<>(Arrays.asList(12,300,213,500,432,123,654));
//        System.out.println(arrayList);
//        arrayList.add(200);
//        System.out.println(arrayList);
//        Set<Integer> set = new HashSet<>(Arrays.asList(2000,2001,2002,2003,2004));
//        arrayList.addAll(set);
//        System.out.println(arrayList);
//        arrayList.remove(213);
//        System.out.println(arrayList);
//        arrayList.removeAll(set);
//        System.out.println(arrayList);
//          arrayList.retainAll(new ArrayList<>(Arrays.asList(12,300,500)));
//          System.out.println(arrayList);
//          arrayList.clear();
//          System.out.println(arrayList);
//        System.out.println(arrayList.size());
            arrayList.contains(12);
            System.out.println(arrayList.contains(12));
        System.out.println(arrayList.containsAll(Arrays.asList(12,300,213,124)));

//        Collection<String> set=new HashSet<>(Arrays.asList("mohhamad","ali","fatemeh","hassan","hossein"));
//        Object[] names =set.toArray();
//        for (Object name:names) {
//            System.out.println(name);
//        }
    }
}
