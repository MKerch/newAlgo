package com.interview.hackerrank.wormup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConvertion {

    public static void main(String[] args) throws ParseException {
        String s = "07:05:45PM";
        System.out.println(timeConversion(s));
    }

    public static String timeConversion(String s) throws ParseException {
        DateFormat inFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = inFormat.parse(s);
        return outFormat.format(date);
    }

}
