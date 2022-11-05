package com.interview.Test;

public class MainOne {
//    public static void main(String[] args) {
//        String s3 = "JournalDev";
//        int start = 1;
//        char end = 5;
//        System.out.println(start + end);
//        System.out.println(s3.substring(start, end));
//        System.exit(1);
//    }

    public static void main(String[] args) {
        foo(null);
    }
    public static void foo(Object o) {
        System.out.println("Object argument");
    }
    public static void foo(String s) {
        System.out.println("String argument");
    }

//    public static void foo(StringBuffer i){
//        System.out.println("StringBuffer impl");
//    }


}
