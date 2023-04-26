package CourseJavaSE.ThreadWaitNotify;

public class ReadThread extends Thread{
    DataHolder holder;

    public ReadThread(DataHolder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            try {
                System.out.println("read :"+this.holder.read());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
