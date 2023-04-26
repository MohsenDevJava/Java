package CourseJavaSE.Abstraction_1;

public class B implements IA,IB{
    @Override
    public void showMessage(String msg) {
        System.out.println("B.showMessage : " + msg);
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int mul(int a, int b) {
            return a * b;
    }

    public void pI (){
        System.out.println("B.pI :" + 3.14 );
    }
}
