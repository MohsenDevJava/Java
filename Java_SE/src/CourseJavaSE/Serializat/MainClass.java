package CourseJavaSE.Serializat;

import java.io.*;

public class MainClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Person person1 = new Person(1,"Mohsen","alikhani",36,19.54);
//
//        FileOutputStream fileOutputStream = new FileOutputStream("./MyFile/File/file4.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(person1);
//        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("./MyFile/File/file4.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 =(Person)objectInputStream.readObject();
        System.out.println(person1);

    }
}
