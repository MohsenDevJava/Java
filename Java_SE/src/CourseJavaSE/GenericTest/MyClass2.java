package CourseJavaSE.GenericTest;

import java.util.List;

public class MyClass2 {

    public static Double toDouble(List<? extends Number> listNum){

       double doubleNumber = 0;

       for(Number number:listNum){
           doubleNumber = number.doubleValue();
       }
       return doubleNumber;
    }
}
