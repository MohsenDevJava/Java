package CourseJavaSE.GenericClass;

public class MyClass2 <T1 extends String,T2 extends Number>{

    T1 x;
    T2 y;

    public MyClass2(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

    public T1 getX() {
        return x;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public T2 getY() {
        return y;
    }

    public void setY(T2 y) {
        this.y = y;
    }

}
