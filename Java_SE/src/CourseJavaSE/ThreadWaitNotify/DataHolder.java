package CourseJavaSE.ThreadWaitNotify;

public class DataHolder {

    private int dates;

    private boolean isNewDate=false;
    public synchronized void write(int date) throws InterruptedException {
       try {
        if (isNewDate){
            wait();
        }
        isNewDate = true;
        this.dates = date;
       }finally {
        notify();
       }
    }

    public synchronized int read() throws InterruptedException {
        try {
            if (!isNewDate){
                wait();
            }
            isNewDate = false;
            return this.dates;
        }finally {
            notify();
        }
    }

}
