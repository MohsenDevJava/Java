package CourseJavaSE.Annotations;

import java.util.ArrayList;

public class MainClass {

//    @Deprecated   //معرفی متد به عنوان متد منسوخ شده
//    public static void printTXT(){
//        System.out.println("print txt");
//    }
//
//    public static void main(String[] args) {
//
//        MyClass obj= new MyClass() {
//            @Override // این متد جایی دیگه تعریف شده شما اگر استفاده کنی باید براش بدنه تعریف کنی
//            public void sum(int x, int y) {
//               System.out.println(x+y);
//            }
//        };
//
//        printTXT();
//    }

    @SuppressWarnings({"rawstype"})//اضافه کردن پیامهای هشدار که کامپایلر به ما می دهد جهت عدم نمایش آنها
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("mehdi");
        arrayList.add("mohsen");
        for(String obj:arrayList){
            System.out.println(obj);
        }
    }
}
