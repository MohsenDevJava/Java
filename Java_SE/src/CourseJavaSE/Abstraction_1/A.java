package CourseJavaSE.Abstraction_1;

public class A implements IA{
    @Override
    public void showMessage(String msg) {
        System.out.println("A.showMessage : " + msg);
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    public void fun(){
        System.out.println("A.fun" + 1000);
    }
}
