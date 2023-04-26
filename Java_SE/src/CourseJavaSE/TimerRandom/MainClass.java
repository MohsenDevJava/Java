package CourseJavaSE.TimerRandom;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println(rand.nextInt(20)+50);
        System.out.println(!rand.nextBoolean());
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextFloat());
        System.out.println(rand.nextLong());

//        Timer timer = new Timer();

//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("Hello!!!");
//            }
//        };
//
//        timer.schedule(timerTask,3000,1000);

//            MyTimerTask task = new MyTimerTask();
//            timer.schedule(task,3000,1000);
//        timer.schedule(new MyTimerTask(),2000,1000);
    }
}
