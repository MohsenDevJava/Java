package CourseJavaSE.Abstraction;

public class MainClass {
    public static void main(String[] args) {

        B b = new B();
        C c = new C() {
            @Override
            public void printMessage(String msg) {
                System.out.println("Hello world from Class C");
            }

            @Override
            public void sum(int a, int b) {
                System.out.println("from Class C => (a+b) = " + (a+b));
            }
        };
        b.mull(50,3);
        b.printMessage("Hello world!");
        b.sum(12,14);

    }
}
