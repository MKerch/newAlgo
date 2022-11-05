package com.interview.hackerrank.java;

import java.util.Calendar;
import java.util.Date;

public class JavaDateAndTime {

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2015));
    }

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(year, month, day));
        int d = cal.get(Calendar.DAY_OF_WEEK);
        String dateName = getDate(d);
        return dateName;
    }

    private static String getDate(int day) {
        if (day == 1) return "MONDAY";
        else if (day == 2) return "TUESDAY";
        else if (day == 3) return "WEDNESDAY";
        else if (day == 4) return "THURSDAY";
        else if (day == 5) return "FRIDAY";
        else if (day == 6) return "SATURDAY";
        else if (day == 7) return "SUNDAY";
        else return "";
    }


}
