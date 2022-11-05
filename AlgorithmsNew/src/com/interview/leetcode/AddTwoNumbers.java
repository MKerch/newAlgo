package com.interview.leetcode;

public class AddTwoNumbers {

    public static void main(String[] args) {
//        String s = "   -42";
        String s = "3.14159";
        int result = myAtoi(s);
        System.out.println(result);
    }

    public static int myAtoi(String s) {
        String update = s.trim();
        String[] s1 = update.split(" ");
        Integer intValue = 0;
        Long longValue = 0L;
        int count = 0;
        for (String i : s1) {
            if (count != 0) return 0;
            String result = i.trim();
            try {
                if (result.contains(".")) result=result.substring(0, result.indexOf("."));
                longValue = Long.parseLong(result);
                intValue = longValue > Integer.MAX_VALUE ? Integer.MAX_VALUE : longValue < Integer.MIN_VALUE ? Integer.MIN_VALUE : longValue.intValue();
                return intValue;
            } catch (Exception e) {
                count++;
            }
        }
        return intValue;
    }

}
