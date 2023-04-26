package CourseJavaSE.MultiThreading;

public class MainClass {

    public static void main(String[] args) {

        TestMultiThreadExtend testMultiThreadExtend1 = new TestMultiThreadExtend("mohsen");
        TestMultiThreadExtend testMultiThreadExtend2 = new TestMultiThreadExtend("mehdi");

        testMultiThreadExtend1.start();
        testMultiThreadExtend2.start();





//        TestMultiThreadImplement testMultiThread1 = new TestMultiThreadImplement("mohsen");
//        TestMultiThreadImplement testMultiThread2 = new TestMultiThreadImplement("ali");
//        Thread thread1 = new Thread(testMultiThread1);
//        Thread thread2 = new Thread(testMultiThread2);
//
//        thread1.run();
//        thread2.run();





//        Thread thread1= new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 50; i++) {
//                    System.out.println("mohsen");
//                }
//            }
//        });
//        Thread thread2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 50; i++) {
//                    System.out.println("mehdi");
//                }
//            }
//        });
//
//
//        thread1.run();
//        thread2.run();
//

    }
}
