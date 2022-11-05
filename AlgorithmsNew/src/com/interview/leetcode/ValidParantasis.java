package com.interview.leetcode;

public class ValidParantasis {

    public static void main(String[] args) {
        String s = "()[]{}";
//        String s = "()";
        System.out.println(isValid2(s));
    }

//    private static boolean isValid(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char current = s.charAt(i);
//            if (!map.containsKey(current)) map.put(current, 1);
//            else map.put(current, map.get(current) + 1);
//        }
//
//        return map.get('(') == map.get(')')
//                && map.get('[') == map.get(']')
//                && map.get('(') == map.get(')')
//                && map.get('{') == map.get('}');
//    }

    private static boolean isValid2(String s) {
        boolean isValid1 = false;
        boolean isValid2 = false;
        boolean isValid3 = false;


        for (int i = 0; i < s.length()-1; i++) {

                char iChar = s.charAt(i);
                char jChar = s.charAt(i+1);
                if (iChar == '[' && jChar == ']') {
                    isValid1 = true;
                    continue;
                } else if (iChar == '[' && jChar != ']') {
                    isValid1 = false;
                }

                if (iChar == '(' && jChar == ')') {
                    isValid2 = true;
                    continue;
                } else if (iChar == '(' && jChar != ')') {
                    isValid2 = false;
                }

                if (iChar == '{' && jChar == '}') {
                    isValid3 = true;
                    continue;
                } else if (iChar == '{' && jChar != '}') {
                    isValid3 = false;
                }
        }
        if(s.length()==2) return isValid1 || isValid2 || isValid3;
        if(s.length()==4) return isValid1 && isValid2 || isValid1 && isValid3 || isValid2 && isValid3;
        return isValid1 && isValid2 && isValid3;
    }
}
