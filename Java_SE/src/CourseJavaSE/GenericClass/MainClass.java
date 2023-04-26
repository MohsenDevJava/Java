package CourseJavaSE.GenericClass;

public class MainClass {
    public static void main(String[] args) {

//        MyClass<Integer>  m1= new MyClass<>(121);
//        MyClass<String>  m2= new MyClass<>("mohsen");
//        MyClass<Double>  m3= new MyClass<>(3.14);
//
//        Integer x = m1.getData();
//        String s = m2.getData();
//        Double d = m3.getData();
//
//        System.out.println(x);
//        System.out.println(s);
//        System.out.println(d);

        MyClass1<String,Boolean> b1= new MyClass1<>("reza",true);
        MyClass1<String,Integer> b2= new MyClass1<>("mohammad",12);
        MyClass1<String,Double> b3= new MyClass1<>("arash",12.43);
        MyClass1<String,Long> b4= new MyClass1<>("bahram",(long)12.3232);








        MyClass2<String,Integer>  m4 = new MyClass2<>("ali",100);
        MyClass2<String,Double>  m5 = new MyClass2<>("ali",10.56);
        MyClass2<String,Long>  m6 = new MyClass2<>("ali",(long)21.564343);
        MyClass2<String,Short>  m7 = new MyClass2<>("ali",(short)32.90);

        System.out.println(m4.getX());
        System.out.println(m4.getY());

    }
}
