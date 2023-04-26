package CourseJavaSE.wrapperClasses;

public class IntegerClass {

    public static void main(String[] args) {

        String num = "1223";

//        System.out.println(Integer.parseInt(num));


        if (isnumber(num)){
            int number = Integer.parseInt(num);
            number++;
            System.out.println("Is a number : "+number);
        }else {
            System.out.println("error!!!");
        }


//        System.out.println(isnumber(num));


//        String w = "23ee5";
//        Integer add = Integer.parseInt(w);
//        System.out.println(add);

//        if(isInteger(w)){
//            int number = Integer.parseInt(w);
//            number++;
//            System.out.println("Is a number : " + number);
//        }else {
//            System.out.println("error");
//        }

//        System.out.println(isInteger("32f3"));
//
//    }
//
//    public static boolean isInteger(String str){
//
//        try {
//            Integer.parseInt(str);
//            return true;
//        }catch (Exception ex){
//            return false;
//        }
    }

    public static boolean isnumber(String st){
        try {
            Integer.parseInt(st);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
