package CourseJavaSE.DataCalander;


import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class MainClass {

    public static void main(String[] args) {

//        Date date1= new Date();
//        System.out.println(date1);
//        Date date2 = new Date(432321214);
//        System.out.println(date2);

//        System.out.println(date1.after(date2));
//        System.out.println(date1.before(date2));
//        System.out.println(date1.equals(date2));
//        System.out.println(date1.compareTo(date2));
//        System.out.println(date1.getTime());


//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        System.out.println(simpleDateFormat.format(date1));
//        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        System.out.println(simpleDateFormat2.format(date1));

        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
//        System.out.println(calendar.getTime());
//        System.out.println(calendar.getTimeZone());


//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar.get(Calendar.HOUR));
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.SECOND));
//        System.out.println(calendar.get(Calendar.MILLISECOND));


//        System.out.println(calendar.getMinimum(Calendar.YEAR));
//        System.out.println(calendar.getMinimum(Calendar.MONTH));
//        System.out.println(calendar.getMinimum(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar.getMinimum(Calendar.HOUR));
//        System.out.println(calendar.getMinimum(Calendar.SECOND));
//        System.out.println(calendar.getMinimum(Calendar.MINUTE));

//         calendar.set(Calendar.YEAR,2013);
//        System.out.println(calendar.getTime());
//        calendar.add(Calendar.YEAR,1);
//        System.out.println(calendar.getTime());
//        calendar.add(Calendar.HOUR,5);
//        System.out.println(calendar.getTime());
//        calendar.add(Calendar.DAY_OF_MONTH,25);
//        System.out.println(calendar.getTime());
        Calendar calendar2 = Calendar.getInstance();
        calendar.add(Calendar.YEAR,-3);
        System.out.println(calendar.getTime());
        System.out.println(calendar2.getTime());
        System.out.println(calendar.equals(calendar2));
        System.out.println(calendar.compareTo(calendar2));

        Date date1 = new Date(Calendar.getInstance().getTimeInMillis());
        Date date2 = new Date(Calendar.getInstance().getTimeInMillis());
        System.out.println(date1);
        System.out.println(date2);

        LocalDate ld1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate ld2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Period datePriod = Period.between(ld1,ld2);
        System.out.println(datePriod.getYears());
        System.out.println(datePriod.getMonths());
        System.out.println(datePriod.getDays());
    }
}
