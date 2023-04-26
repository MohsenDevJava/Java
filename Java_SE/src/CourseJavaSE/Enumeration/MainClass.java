package CourseJavaSE.Enumeration;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(UserType.ADMIN.getValue());
        System.out.println(UserType.defaultUser());
        System.out.println(UserType.valueOf("ADMIN").getValue());
        System.out.println(UserType.ADMIN.getClass());
        System.out.println(UserType.EMPLOYEE.getValue().equals("employee"));
//


//        System.out.println(DaysOfWeek.FRIDAY);
//        System.out.println(DaysOfWeek.SUNDAY);
//
//        System.out.println(DaysOfWeek.MONDAY.getValue());
//
//        System.out.println(DaysOfWeek.defualtDayOfWeek());

//        System.out.println(DaysOfWeek.getDayByVlaue(21));
//        System.out.println(DaysOfWeek.getDayByVlaue(1));

//        System.out.println(DaysOfWeek.MONDAY.name().indexOf('A'));
//        System.out.println(DaysOfWeek.MONDAY.name().toLowerCase());
//        System.out.println(DaysOfWeek.MONDAY.name().endsWith("Y"));
//        System.out.println(DaysOfWeek.SUNDAY.getClass());
//        System.out.println(DaysOfWeek.SUNDAY.equals(DaysOfWeek.MONDAY));
//        System.out.println(DaysOfWeek.values().length);
//
//         DaysOfWeek[] day = DaysOfWeek.values().clone();
//        for (DaysOfWeek d:day) {
//            System.out.print(d.name()+"="+d.getValue()+"\t");
//        }

    }
}
