package CourseJavaSE.GenericTest;

public class  MyClass3 {

    public static <T extends Comparable<T> > T maxValue(T a, T b, T c){
        T max = a;

        if(b.compareTo(max)>0){
            max = b;
        }
        if (c.compareTo(b)>0){
            max = c;
        }
        return max;
    }
}
