package com.interview.leetcode;

public class LongestValidParentheses {

    public static void main(String[] args) {
        String s = ")()())";
//        String s1 = "()";
        //should return max length
        System.out.println(longestValidParentheses(s));
    }

//    public static int longestValidParentheses(String s) {
//        int i1 = s.indexOf("(");
//        int i2 = s.lastIndexOf(")");
//        if (i1 != -1 && i2 != -1 && i1 < i2) {
//            return s.substring(i1, i2).length();
//        }
//        return 0;
//    }

    public static int longestValidParentheses(String s) {
        int currentCount = 0;
        int maxCount = 0;
        int endIndex = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String result = createString(s.charAt(i), s.charAt(i + 1));
            if (result.equals("()") && currentCount == 0) {
                currentCount += 2;
                endIndex = i + 1;
                i++;
                if (currentCount > maxCount)
                    maxCount = currentCount;
            } else if (result.equals("()") && currentCount != 0 && (i + 1) - endIndex == 2) {
                currentCount += 2;
                endIndex = i + 1;
                i++;
                if (currentCount > maxCount)
                    maxCount = currentCount;
            } else {
                currentCount = 0;
                endIndex = 0;
            }
        }
        return maxCount;
    }

    private static String createString(char c1, char c2) {
        return ("" + c1 + c2);
    }

}
