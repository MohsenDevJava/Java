package CourseJavaSE.MultiThreading;

public class TestMultiThreadImplement implements Runnable{

    String name;

    public TestMultiThreadImplement(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(this.name+"_"+i);
        }
    }
}
