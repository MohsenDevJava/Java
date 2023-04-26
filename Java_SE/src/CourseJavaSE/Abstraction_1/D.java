package CourseJavaSE.Abstraction_1;

public class D {

    private int id;
    private String name;

    public void showNameId(){
         E e1 = new E();
        System.out.println("D.showNameId : "+ e1.add());
    }



    class E{
        int add(){
            return 10 + 2;
        }
    }
}
