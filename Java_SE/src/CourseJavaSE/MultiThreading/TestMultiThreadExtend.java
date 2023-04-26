package CourseJavaSE.MultiThreading;

public class TestMultiThreadExtend extends Thread{

    String name;

    public TestMultiThreadExtend(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(this.name+"_"+i);
        }
    }
}
