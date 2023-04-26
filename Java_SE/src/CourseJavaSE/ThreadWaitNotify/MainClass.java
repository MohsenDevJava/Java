package CourseJavaSE.ThreadWaitNotify;

public class MainClass {

    public static void main(String[] args) {

        DataHolder holder = new DataHolder();
        WriteThread writeThread = new WriteThread(holder);
        ReadThread readThread = new ReadThread(holder);

        writeThread.start();
        readThread.start();
    }
}
