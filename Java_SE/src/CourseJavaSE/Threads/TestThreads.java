package CourseJavaSE.Threads;

import java.util.Date;

public class TestThreads extends Thread{

    String name;

    public TestThreads(String name) {
        this.name = name;
    }

    @Override
    public synchronized void run() {
        System.out.println("start: " + new Date());
//       synchronized (this) {
           for (int i = 0; i < 10; i++) {
               System.out.println(name + "_" + i);
           }
//       }
        System.out.println("end: " + new Date());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static synchronized void sum(int x ,int y){
        System.out.println(x+y);
    }
}
