package CourseJavaSE.GenericClass;

public class MyClass1 <T1,T2>{

    T1 x;
    T2 y;

    public MyClass1(T1 e , T2 y) {
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
