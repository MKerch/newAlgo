package com.interview.hackerrank.basic;

import java.util.HashMap;
import java.util.Map;

public class TheTimeinWords {

//    final static String[] digitArray = {"zero", "one", "two", "three", "fore",
//            "five", "six", "seven", "eight", "nine"};

//    final static String[] decimalArray = {"zero", "ten", "twenty", "thirty", "forty",
//            "fifty", "sixty", "seventy", "eighty", "ninety"};


    static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "quarter");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "half");
        map.put(40, "forty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");

//        System.out.println(timeInWords(5, 47));
//        System.out.println(timeInWords(7, 29));
//        System.out.println(timeInWords(6, 35));
//        System.out.println(timeInWords(4, 15));
        System.out.println(timeInWords(5, 45));

    }

    public static String timeInWords(int h, int m) {
        int decMinutes = m - (m % 10);
        int restMin = m % 10;
        if (m == 0) return map.get(h) + " o' clock";
        if (m > 0 && m < 10) return map.get(m) + " minute past " + map.get(h);
        if (m > 10 && m < 20 && m != 15) return map.get(m) + " minutes past " + map.get(h);
        if (m >= 20 && m < 30) {
            if (restMin == 0 || m < 20) return map.get(m) + " minutes past " + map.get(h);
            else return map.get(decMinutes) + " " + map.get(restMin) + " minutes past " + map.get(h);
        }
        if (m == 15 || m == 30) return map.get(m) + " past " + map.get(h);
        if (m > 30 && m != 45) {
            int min = 60 - m;
            int dec = min - (min % 10);
            int rest = min % 10;
            if (rest == 0 || min < 20) return map.get(min) + " minutes to " + map.get(h + 1);
            else return map.get(dec) + " " + map.get(rest) + " minutes to " + map.get(h + 1);
        }
        if (m == 45) return map.get(60 - m) + " to " + map.get(h + 1);
        return "";
    }

//    public static String timeInWords(int h, int m) {
//        switch (m) {
//            case 0:
//                return hoursArray[h] + " o' clock";
//            case 1:
//                return "one minute past " + hoursArray[h];
//            case 10:
//                return "ten minutes past " + hoursArray[h];
//            case 15:
//                return "quarter past " + hoursArray[h];
//            case 30:
//                return "half past " + hoursArray[h];
//            case 40:
//                return "twenty minutes to " + hoursArray[h + 1 % 12];
//            case 45:
//                return "quarter to " + hoursArray[h + 1 % 12];
//            case 47:
//                return "thirteen minutes to " + hoursArray[h + 1 % 12];
//            case 28:
//                return "twenty eight minutes part " + hoursArray[h];
//        }
//        return "";
//
//    }

}
