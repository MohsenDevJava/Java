package CourseJavaSE.NestedClasses;

public class MainClass {

    public static void main(String[] args) {

//        TestStaticNestedClass testStaticNestedClass = new TestStaticNestedClass();
//        TestStaticNestedClass.StaticNestedClass staticNestedClass = new TestStaticNestedClass.StaticNestedClass();
//        staticNestedClass.accessNumber(testStaticNestedClass);

//        TestNonStaticNestedClass testNonStaticNestedClass= new TestNonStaticNestedClass();
//
//        TestNonStaticNestedClass.innerClass innerClass = testNonStaticNestedClass.new innerClass();
//        innerClass.accessMember();

//        LocalInnerClass obj1=new LocalInnerClass();
//        obj1.fun1();

        AnonymousInnerClass obj1=new AnonymousInnerClass();
        AnonymousInnerClass.inner obj2 = obj1.new inner();

        obj2.t1.print(32);

    }
}
