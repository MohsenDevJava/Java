package CourseJavaSE.CustomAnnotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {

    //برای معرفی Annotation می توانیم بدون مفدار تعریف کنیم در اینصورت از جایی که از ان استفاده می کنیم باید مقدار داده شود

    //    String name();
    //    String family();
    //    int age();

    // می توانیم field هایی را تعریف کنیم با مقدار Default
    String name() default "";
    String family() default "alikhani";
    int age() default 32;
    String[] courses() default {"C1,C2,C3"};
    Color color() default Color.RED;
}

enum Color{
    RED,GREEN,BLUE
}

