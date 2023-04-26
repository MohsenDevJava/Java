package CourseJavaSE.CustomAnnotation;

import java.lang.annotation.Repeatable;

public class MainClass {

    @Repeatable(myRepeated.class)
    @interface City{
        String cityName() default "";
        int cityCode() default 0;
    }

    @interface myRepeated{
        City[] value();
    }

    @City(cityName = "tehran",cityCode = 1)
    @City(cityName = "Isfahan",cityCode = 2)
    public static void ShowInfoCity(){
        System.out.println("info city:");
    }

    public static void main(String[] args) {

    }
}
