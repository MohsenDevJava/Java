package CourseJavaSE.GenericTest;

public class MyClass1 {


    public  <T> T showClass(T data){

        System.out.println(data.getClass().getName());
        return data;
    }

}
