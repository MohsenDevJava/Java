package CourseJavaSE.Enumeration;

public enum DaysOfWeek {

    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);

    private  int value;
    DaysOfWeek(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static DaysOfWeek defualtDayOfWeek(){
        return DaysOfWeek.FRIDAY;
    }

    public static DaysOfWeek getDayByVlaue(int value){

        for (DaysOfWeek days:DaysOfWeek.values()) {
            if (days.value == value){
                return days;
            }
        }
        return null;
    }
}
