package com.interview.hackersRank.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConverter {

    public static void main(String[] args) throws ParseException {
        String s = "12:01:00PM";//Return '12:01:00'.
//        String s = "12:01:00AM";//Return '00:01:00'.
        String result = convertTime(s);
        System.out.println(result);
    }

    private static String convertTime(String s1) {
        String s = s1.substring(0, 8) + " " + s1.substring(8);
        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");
        Date parse = null;
        try {
            parse = date12Format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date24Format.format(parse);
    }
}
