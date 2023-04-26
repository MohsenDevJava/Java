package CourseJavaSE.ClassClass;

public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Class c1 = Person.class;

//        Field[] fields = c1.getDeclaredFields();
//        for (Field field:fields) {
//            System.out.print(field.getName() + " \t");
//        }
//        System.out.println();
//        Method[] methods = c1.getMethods();
//        for (Method method:methods) {
//            System.out.print(method.getName() + "\t");
//        }

        Class c2 = MyClass.class;
//
//
//        System.out.println();
//        System.out.println(c1.getName());

//        System.out.println(c2.getSuperclass());
//
//        System.out.println(c1.getPackage());
//
//        System.out.println(c2.getPackage());
//
//        System.out.println(c1.isInterface());
//
//        Class c3 = MyInterface.class;

//        System.out.println(c3.isInterface());
//
//        Class c4= boolean.class;
//        Class c5= int.class;
//        Class c6=Integer.class;
//        Class c7=String.class;
//        System.out.println("----------------------------------------------");
//        System.out.println("C1: "+c1.isPrimitive());
//        System.out.println("c2: "+c2.isPrimitive());
//        System.out.println("c3: "+c3.isPrimitive());
//        System.out.println("c4: "+c4.isPrimitive());
//        System.out.println("c5: "+c5.isPrimitive());
//        System.out.println("c6: "+c6.isPrimitive());
//        System.out.println("c7: "+c6.isPrimitive());
//
//        Class c9 = Person.class;
//        Person per = (Person) c9.newInstance();
//        per.setName("amir");
//        System.out.println(per.getName());
//
//
        Class c8 = new Person().getClass();
        try {
            Person person1 = (Person) c8.newInstance();
            person1.setName("shervin");
            System.out.println(person1.getName());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
//
//        Class person1 = new Person().getClass();
//
//        try {
//            Person person2 = (Person) person1.newInstance();
//        }catch (InstantiationException e){
//            throw new RuntimeException(e);
//        }catch (IllegalAccessException e){
//            throw  new RuntimeException(e);
//        }
    }
}
