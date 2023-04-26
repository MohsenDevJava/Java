package CourseJavaSE.StringClass;

public class MainClass {

    public static void main(String[] args) {

        String str1 = "Hello my name is Mohsen. I'm Student.";

//        System.out.println(str1.charAt(6)); // پیدا کردن کاراکتر در خواستی
//        System.out.println(str1.compareTo("Hello my name is Mohsen. I'm Student")); //مقایسه کردن
//        System.out.println(str1.length());// شمارش طول str1
//        System.out.println(str1.concat("***")); //اضافه کردن به آخر str1
//        System.out.println(str1.isEmpty()); //برسی می کند آیا str1 خالی است یا خیر
//        System.out.println(str1.substring(3));//عمل جدا سازی از شماره کاراکتر مشخص شده
//        System.out.println(str1.replace('m','$'));//به جای کاراکتر شده جایگزین می کند
//
//        String[] str2 = str1.split(" ");
//        for (String s:str2) {
//            System.out.print(s + "-");  //عمل شکستن و جدا کردن بر اساس معیاری که ما تعیین می کنیم
//        }
//        System.out.println();
//        char[] str3 = str1.toCharArray();
//        for (char ch:str3) {             //جدا کردن رشته به صورت کاراکترها
//            System.out.print(ch+",");
//        }
//        System.out.println();
//
//        System.out.println(str1.toLowerCase()); // رشته را به حروف کوچکتر تبدیل می کند
//        System.out.println(str1.toUpperCase());// رشته را به حروف بزرگتر تبدیل می کند
//
//        System.out.println(str1.trim()); // حذف فاصله های اول و آخر رشته
//
//        byte[] str4 = str1.getBytes();
//        for (byte s:str4) {              //تبدیل کاراکترهای رشته به کد اسکی
//            System.out.print(s + "-");
//        }
//
//        System.out.println();
//
//        System.out.println(str1.contains("mohsen")); //به دنبال رشته درخواستی درون رشته مورد نظر می گردد
//        System.out.println(str1.startsWith("Hello"));//به دنبال رشته درخواستی در اول رشته می گردد
//        System.out.println(str1.endsWith("."));//به دنبال رشته در خواستی در آخر جمله می گردد
////
//        System.out.println(str1.indexOf("Mohsen")); // شماره ایندکس رشته درخواستی را نمایش می دهد
//
//
//        byte[] byte1 = {12,65,97,102,21,34};
//        char[] char2 = {'a','Z','&','$',9};
//
//        String str5 = new String(byte1); //برای تبدیل آرایه ای از bytes ها به یک رشته
//        String str6 = new String(char2);// برای تبدیل آرایه از کاراکتر ها به یک رشته
//
//        System.out.println(str5);
//        System.out.println(str6);
//
//
//        char[] char3 = {'t','G','R','A','#','b'};
//        byte[] byte2 = {12,11,123,65,76,88};
//       String str7 = String.copyValueOf(char3);// این متد که برای استفاده باید حتما کلاس String را صدا بزنیم برای تبدیل آرایه از  کاراکتر ها به یک رشته
//        System.out.println(str7);
//
//
//        char[] char4 = new char[10];
//        str1.getChars(3,10,char4,3);//با این متد می توانیم عمل جدا سازی کاراکتر های یک رشته و ریختن درون یک لیست کاراکتر دیگر
//        for (char ch:char4) {
//            System.out.print(ch + "-");
//        }
//        System.out.println();
//       String str8 =String.valueOf(432); // برای تبدیل هر نوع ورودی به یک رشته
//       String str9 =String.valueOf(true); // برای تبدیل هر نوع ورودی به یک رشته
//        System.out.println(str8 + 200);
//        System.out.println(str9);
    }
}
