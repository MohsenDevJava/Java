package CourseJavaSE.FileStream2;

import java.io.*;

public class MainClass {

    public static void main(String[] args) throws IOException {

//        FileInputStream fileInputStream = new FileInputStream("C:\\testFile\\file3.txt");
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//        byte[] bytes = new byte[1024];
//        int index;
//        while ((index=bufferedInputStream.read(bytes))!=-1){
//                String str = new String(bytes);
//                System.out.println(str);
//        }
//        bufferedInputStream.close();

//        FileInputStream fileInputStream = new FileInputStream("C:\\testFile\\file3.txt");
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\testFile\\file4.txt");
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//        byte[] bytes = new byte[2034];
//        int index;
//        while ((index= bufferedInputStream.read(bytes))!=-1){
//            bufferedOutputStream.write(bytes);
//        }
//        bufferedInputStream.close();
//        bufferedOutputStream.close();

//        FileInputStream fileInputStream = new FileInputStream("./MyFile/Pic/1.jpg");
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//
//        FileOutputStream fileOutputStream = new FileOutputStream("./MyFile/Pic/pic.jpg");
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//
//        byte[] bytes = new byte[1024];
//        int i;
//        while ((bufferedInputStream.read(bytes))!=-1){
//            bufferedOutputStream.write(bytes);
//        }
//        bufferedInputStream.close();
//        bufferedOutputStream.close();

//        FileReader fileReader = new FileReader("C:\\testFile\\file1.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        char[] chars = new char[2023];
//        bufferedReader.read(chars);
//        StringBuilder stringBuilder = new StringBuilder();
//        for (char ch:chars) {
//            stringBuilder.append(ch);
//        }
//        System.out.println(stringBuilder);
//        bufferedReader.close();

//        int index;
//        while ((index=bufferedReader.read(chars))!=-1){
//            String str = new String(chars);
//            System.out.println(str);
//        }

//        FileWriter fileWriter = new FileWriter("C:\\testFile\\file5.txt");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("Hello my name is mohsen!!!");
//        bufferedWriter.close();


        FileCopy("C:\\testFile\\file1.txt","C:\\testFile\\file5.txt");
    }

    public static void FileCopy(String address1,String address2) throws IOException {
        FileReader fileReader = new FileReader(address1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(address2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        char[] chars = new char[2023];
        fileReader.read(chars);
        int index;
        while ((index=fileReader.read(chars))!=-1){
            bufferedWriter.write(chars);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
