package chapter1;

import java.util.Calendar;

public class DateStarter {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(Calendar.HOUR_OF_DAY,0);
        System.out.println(calendar.getTime());

}}
