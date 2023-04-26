package CourseJavaSE.Lambda;

public class MainClass {

    public static void main(String[] args) {

//        MyInterface myInterface =(x,y)-> x+y;
//        System.out.println(myInterface.sum(12,32));

//        MyInterface myInterface1 = (txt)->System.out.println(txt);
//        myInterface1.text("Hello lambda");

//        MyInterface myInterface2 = (x)->{
//            Integer d = x;
//           double d1 = d.doubleValue();
//            return d1;
//        };
//
//        System.out.println(myInterface2.convToDou(32));
//
//        MyInterface myInterface3 =()-> System.out.println("Hi every body...");
//        myInterface3.show();

        Operation sum =(num1,num2)->(num1 + num2);
        Operation sub =(num1,num2)->(num1 - num2);
        Operation mul =(num1,num2)->(num1 * num2);
        Operation div =(num1,num2)->(num1 / num2);

//        System.out.println(sum.operator(12,22));

        myMethod(133,34,sum);
        myMethod(145,34,sub);
        myMethod(198,34,mul);
        myMethod(234,34,div);
    }

    public static void myMethod(int x , int y,Operation operator){
        System.out.println(operator.operations(x, y));
    }
}
