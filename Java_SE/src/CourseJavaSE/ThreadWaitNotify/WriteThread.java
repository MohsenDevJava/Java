package CourseJavaSE.ThreadWaitNotify;

public class WriteThread extends Thread{
    DataHolder holder;

    public WriteThread(DataHolder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            try {
            System.out.println("write : "+ i);
                holder.write(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
