package CourseJavaSE.FileDirectory1;

import java.io.*;

public class MainClass {

    public static void main(String[] args) {

        File file1 = new File("C:\\testFile\\images\\photo_1.jpg");
        File dir1= new File("C:\\testFile\\images");

//        System.out.println(file1.isFile());
//        System.out.println(file1.getName());
//        System.out.println(file1.getParent());
//        System.out.println(file1.length());
//        System.out.println(file1.isDirectory());

        File[] fileList=dir1.listFiles();
        for (File file:fileList){
            System.out.println(file.getParent()+" "
                    + file.getName()
                    +" "+file.length()+" "+file.isFile());
        }

        System.out.println("-------------------------------");
        String[] list1 = dir1.list();
        for (String items:list1){
            System.out.println(items+" "+items.length()+" "+items.isEmpty());
        }
    }
}
