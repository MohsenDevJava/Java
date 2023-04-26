package CourseJavaSE.TimerRandom;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    public int counter;

    @Override
    public void run() {
        System.out.println("Mohsen_"+counter);
        counter++;
    }
}
