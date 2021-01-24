package hackerrank;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class DataAndTime {

    public static void main(String[] args) {

        System.out.println(findDay(12, 5, 2020));


    }


    public static String findDay(int month, int day, int year) {

        Map<Integer, String> Dayofmonth = new HashMap<>();
        Dayofmonth.put(1, "MONDAY");
        Dayofmonth.put(2, "TUESDAY");
        Dayofmonth.put(3, "WEDNESDAY");
        Dayofmonth.put(4, "THURSDAY");
        Dayofmonth.put(5, "FRIDAY");
        Dayofmonth.put(6, "SATURDAY");
        Dayofmonth.put(0, "SUNDAY");

        System.out.println();


        Calendar c = new GregorianCalendar(year, month - 1, day);
        Date date = c.getTime();

        System.out.println(date);
        int newday = date.getDay();
        System.out.println(newday);

        String Ourday = Dayofmonth.get(newday);

        return Ourday;


    }

}

