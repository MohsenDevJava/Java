package CourseJavaSE.Threads;

public class TestThreadWithRunable implements Runnable{

    String name;

    public TestThreadWithRunable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + "_"+i);
        }
    }
}
