package JavaStandarClasses;

import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args){

        Date tanggal = new Date(3357200000L);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);

        Date result = calendar.getTime();
        System.out.println(result);

    }
}
