package com.interview.hackerrank.basic;

public class DayOfTheProgrammer {

    public static void main(String[] args) {
//        System.out.println(2700 / 4);
        System.out.println(dayOfProgrammer(2700));
    }
//almoust correct
//    public static String dayOfProgrammer(int year) {
//        if (year == 1918) return "26.09." + year;
//        if (year % 4 == 0) return "12.09." + year;
//        else return "13.09." + year;
//    }

    public static String dayOfProgrammer(int year) {
        if (year == 1918) return "26.09." + year;
        if (year >= 1700 && year <= 1917 && year % 4 == 0) return "12.09." + year;
        if (year > 1918 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return "12.09." + year;
        else return "13.09." + year;
    }


}
