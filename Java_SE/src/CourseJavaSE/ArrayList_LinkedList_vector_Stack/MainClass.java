package CourseJavaSE.ArrayList_LinkedList_vector_Stack;

import java.util.*;
import java.util.function.UnaryOperator;

class Operation implements UnaryOperator<String>{
    @Override
    public String apply(String s) {
        return "*"+s+"#";
    }
}

public class MainClass {

    public static void main(String[] args) {
//        ArrayList<String> list1=new ArrayList<>();
//        list1.addAll(Arrays.asList("Mohsen","reza","mehdi","mohammad","bahram","farideh"));
//        System.out.println(list1);
//        list1.ensureCapacity(10000);//به لیستمان فضایی را اضافه می کنیم
//        System.out.println(list1);
//        list1.trimToSize(); //فضاهای اضافی را حذف می کند
//        list1.add("sara");
//        System.out.println(list1);
//        list1.replaceAll(new Operation());//متد برای اضافه کردن چیزی و یا تغییر بر روی عناصر داخل لیست
//        System.out.println(list1);

//
//        LinkedList<String> linkedList= new LinkedList<>(Arrays.asList("nima","shima","behrooz","sayeh","baktash"));
//
//        linkedList.addFirst("somayeh naro");//اضافه کردن عنصری به اول لیست
//        linkedList.addLast("somayeh bia");//اضافه کردن عنصری به آخر لیست
//        System.out.println(linkedList);
//        System.out.println(linkedList.getFirst());//این متد برای فراخوانی عنصر اول لیست
//        System.out.println(linkedList.getLast());//این متد برای فراخوانی عنصر آخر لیست


//        Vector<String> vectorList = new Vector<>(Arrays.asList("sani","mani","bani","lari","sari","kari"));
//        vectorList.insertElementAt("rajab ali" ,4);//این متد برای اضافه کردن عنصری در ایندکس مورد نظر در لیست
//        System.out.println(vectorList);
//        vectorList.removeElementAt(3);//این متد برای حذف عنصر در ایندکس مورد نظر
//        System.out.println(vectorList);



        //ساختار stack مانند لیوان می ماند که هر چی داخل لیوان بریزیم آخرین عنصر می توانیم اضافه کنیم و یا از آخر حذف کنیم

        Stack<String> stackList = new Stack<>();
        stackList.addAll(Arrays.asList("igor","sasha","dasha","masha","vasia","soniya"));
//        System.out.println(stackList);
//        stackList.push("lena");//برای اضافه کردن عنصری به آخر لیست
//        System.out.println(stackList);
//        stackList.pop(); // این متد برای حدف آخرین عنصر می باشد
//        System.out.println(stackList);
//
//        while (stackList.size()>0){
//            stackList.pop();
//            System.out.println(stackList);
//        }

        stackList.replaceAll(new Operation());
        System.out.println(stackList);
    }
}
