package CourseJavaSE.Stream_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {

        int[] intsList ={23,12,22,33,55,2,3,67,5,19,18,20};
        double[] doublesList = {32.2,12.3,3.14,54.31,17.3};
        Arrays.stream(intsList);

//        System.out.println(Arrays.stream(intsList).sum());
        int maximum = Arrays.stream(intsList).max().getAsInt();
        int minimum = Arrays.stream(intsList).min().getAsInt();
//        double average = Arrays.stream(intsList).average().getAsDouble();
//        System.out.println(maximum);
//        System.out.println(minimum);
//        System.out.println(average);
//        System.out.println(Arrays.stream(intsList).count());

//        Arrays.stream(intsList).filter(x->x<10)
//                .map(x->x+10)
//                .forEach(num-> System.out.print(num + "\t"));
//          Arrays.stream(intsList).filter(number->number>10)
//                  .map(numbers->numbers / 5)
//                  .forEach(num-> System.out.print((double) num + " -"));

//        double minDouble = Arrays.stream(doublesList).min().getAsDouble();
//        double maxDouble = Arrays.stream(doublesList).max().getAsDouble();
//
//        System.out.println(Arrays.stream(doublesList).sum());
//        System.out.println(minDouble);
//        System.out.println(maxDouble);


        List<String> names = new ArrayList<>(Arrays.asList("reza","bahram","darab","sara","makha","somaye"));

        System.out.println(names.stream().count());

        List<String> list1 = names.stream().filter(item->item.contains("m")).collect(Collectors.toList());
          List<String> list2 = names.stream().filter(n->n.length() > 3).map(nam->nam.toUpperCase()).collect(Collectors.toList());
        System.out.println(list1);
          System.out.println(list2);
    }
}
