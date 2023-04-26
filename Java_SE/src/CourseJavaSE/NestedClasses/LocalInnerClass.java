package CourseJavaSE.NestedClasses;

public class LocalInnerClass {

    int age=36;
    String name="mohsen";
    private String family="alikhani";

    void fun1(){

        class test {
            int add=100;
            void sum(int x ,int y){
                System.out.println(x+y+add);
            }
        }

        test f1=new test();
        f1.sum(100,200);
    }
}
