package CourseJavaSE.NestedClasses;

public class TestNonStaticNestedClass {

    String name="mohsen";
    String family="alikhani";
    private int age=36;


    class innerClass{

        void accessMember(){
            System.out.println(name);
            System.out.println(family);
            System.out.println(age);
        }

    }
}
