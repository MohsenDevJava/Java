package CourseJavaSE.NestedClasses;

abstract class test1{
    int num1=10;
    abstract void print(int num);
}

interface Itest{
    int Inum=40;
    void print();
}

public class AnonymousInnerClass {
    int num2 =20;

    class inner{
        test1 t1= new test1() {
            @Override
            void print(int num3) {
                System.out.println(num1);
            }
        };
    }

    Itest it=new Itest() {
        @Override
        public void print() {
            System.out.println(Inum);
        }

    };

}
