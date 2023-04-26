package CourseJavaSE.CustomAnnotation;

@MyAnnotation(name = "mohsen",family ="alikhani",age=35)

public class Person {

    @MyAnnotation(name="mohsen",family = "alikhani",age = 45 ,courses = {"nima","sami","sina","soheil"})
    private String namePerson;

    private  int personId;


    @MyAnnotation(name="mohsen",family = "alikhani",age=32,color = Color.RED)
    public void showPersonInfo() {
        System.out.println(namePerson+"\t"+personId);
    }
}
