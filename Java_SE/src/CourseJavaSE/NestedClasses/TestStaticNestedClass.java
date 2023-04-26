package CourseJavaSE.NestedClasses;

public class TestStaticNestedClass {

    private static String name="mohsen";
     String family="alikhani";
    private int age=35;

     static class StaticNestedClass{
         int number=1000;

       void accessNumber(TestStaticNestedClass obj1){
           System.out.println(name);
           System.out.println(obj1.family);
           System.out.println(obj1.age);

           name = "reza";
           obj1.family ="rezaei";
           obj1.age = 32;

           System.out.println(name);
           System.out.println(obj1.family);
           System.out.println(obj1.age);
       }
    }
}
