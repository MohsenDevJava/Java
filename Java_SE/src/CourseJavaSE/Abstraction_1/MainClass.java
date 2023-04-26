package CourseJavaSE.Abstraction_1;

public class MainClass {

    public static void main(String[] args) {

        IA ia1 = new A();
        IB ib1 = new B();
        C c1 = new C();
        D d = new D();

        d.showNameId();

        ((A)ia1).fun();

        ((B)ib1).pI();

    }
}

