package com.interview.hackerrank.basic;

public class AppendAndDelete {

    //TODO
    public static void main(String[] args) {
        System.out.println(
                //appendAndDelete("hackerhappy", "hackerrank", 9));
//                appendAndDelete("abcd", "abcdert", 10));
                appendAndDelete("asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", "bsdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", 100));
//                appendAndDelete("aaaaaaaaaa", "aaaaa", 7));
    }

    public static String appendAndDelete(String s, String t, int k) {
        if ((t.length() - s.length()) * 2 >= k) return "No";
        int correctLength = 0;
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(0, i + 1);
            boolean contains = t.startsWith(sub);
            if (contains) {
                correctLength++;
            } else {
                result = s.length() - correctLength + t.length() - correctLength;
                break;
            }
        }
        return result <= k ? "Yes" : "No";
    }

//    public static String appendAndDelete(String s, String t, int k) {
//        // Write your code here
//        int length = Math.max(s.length(), t.length());
//        int count = 0;
//        for (int i = 0; i < length; i++) {
//            if (!(i < t.length() && s.charAt(i) == t.charAt(i))) {
//                count++;
//            }
//        }
//        if((count*2)+s.length()-t.length()>k) return "NO";
//        else return "YES";
//    }

}
