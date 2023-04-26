package CourseJavaSE.Abstraction;

public class A implements IA{
    @Override
    public void printMessage(String msg) {
        System.out.println("The massage from Class A"+"\t" + msg);
    }

    @Override
    public void sum(int a, int b) {
        System.out.println("Class A => (a+b) = " + (a+b));
    }
}
