package CourseJavaSE.Reflection;

import java.lang.reflect.Field;

public class MainClass {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {

        Person person1= new Person();

        @SuppressWarnings({"type rawuse","variable"})
        Class c1=Person.class;
//        Class c2=person1.getClass();
//        Class c3=Class.forName("darsmanAdvanced.Reflection.Person");
//
//        Class st1=Student.class;
//        System.out.println(c1.getName());
//        System.out.println(c1.getSuperclass());
//
//        System.out.println("-------------------------------------------------");
//        System.out.println(st1.getSuperclass());
//        System.out.println(st1.getName());
//
//        System.out.println("----------------------------------------------");
//        Field[] fields=c1.getDeclaredFields();
//        for (Field field:fields){
//            System.out.println(field.getName());
//        }
//        System.out.println("-----------------------------------------------");
//        Method[] methods=c1.getDeclaredMethods();
//        for (Method method:methods){
//            System.out.println(method.getName());
//        }
//        System.out.println("------------------------------------------------");

//            Class classMember=Person.class;
//            Annotation[] annotations = classMember.getAnnotations();
//            for (Annotation annotation:annotations){
//                System.out.println(annotation.annotationType());
//            }
//        System.out.println("--------------------------------------------------");
//        Class[] classes = c1.getDeclaredClasses();
//        for (Class cls:classes){
//            System.out.println(cls);
//        }

//          System.out.println("--------------------------------------------------");

//        Constructor[] constructors=c1.getConstructors();
//        System.out.println(constructors.length);
//        for (Constructor cons:constructors){
//              Class[] params= cons.getParameterTypes();
//              if (params.length>0){
//              for (Class cls:params){
//                  System.out.println(cls);
//              }
//              }else{
//                  System.out.println("no params");
//              }
//        }
//        System.out.println();

//        System.out.println("--------------------------------------------------");
//        System.out.println(c1.getModifiers());
//        System.out.println(Modifier.isPublic(c1.getModifiers()));
//        System.out.println(Modifier.isPrivate(c1.getModifiers()));
//        System.out.println(Modifier.isAbstract(c1.getModifiers()));

        System.out.println("--------------------------------------------------");

        Person person = new Person(1,"mohsen","alikhani",36);

        Class clazz = Person.class;
         Field ageFiled=clazz.getDeclaredField("age");
        ageFiled.setAccessible(true);
        int age= (Integer) ageFiled.get(person);
        System.out.println(age);

        Field nameField=clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        String name= (String) nameField.get(person);
        System.out.println(name);
    }
}
