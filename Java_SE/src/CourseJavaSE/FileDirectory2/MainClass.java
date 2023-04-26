package CourseJavaSE.FileDirectory2;

import java.io.File;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {

//        File dir1= new File("C:\\Windows");
//
//        File[] files1 = dir1.listFiles();
//        File[] files2 = dir1.listFiles(new MyFileNameFilter(".dll",".xml",".txt"));
//
//        for (File file:files1){
//            System.out.println(file.getName());
//        }
//        System.out.println("-----------------------------");
//        for (File file:files2){
//            System.out.println(file.getName());
//        }
//        System.out.println(files2.length);

//        File dir1= new File("C:\\Windows");
//
//        File[] files = dir1.listFiles(new MyFileFilter(false)); //true=file in directory , false=directory
//        for (File file:files){
//            System.out.println(file.getName());
//        }

//        File file3 = new File("./MyFile/File/file1.txt");
//        System.out.println(file3.getName());

        //نکته مهم نمی توانیم فایل یا دایرکتوری تکراری به سازیم

        File file4 = new File("./MyFile/File/file3.txt");//آدرس محل ساخت فایل
        System.out.println(file4.exists());//برای شناسایی وجود این فایل درون دایرگتوری مورد نظر
        try {
            file4.createNewFile();      //برای ساخت فایل حتما نیاز است از try -catch استفاده کنیم
        } catch (IOException e) {
            e.getMessage();
        }

        File dir3 = new File("./MyFile/power point"); //مراحل ساخت یک پوشه درون دایرکتوری مورد نظر
        dir3.mkdir(); //این متد برای ساخت یک دایرکتوری می باشد

        File dir4 = new File("./MyFile/new/new1/new2/new3");//براس ساخت دایرکتوری های تو در تو
        dir4.mkdirs();



    }
}
