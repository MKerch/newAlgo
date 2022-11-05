package com.interview.leetcode.general;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
//        String s = "()[]{}";
//        String s = "()";
        String s = "{[]}";
//        String s = "((";
//        String s = "(){}}{";
//        String s = "(]";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else {
                if (stack.isEmpty()) return false;
                else {
                    char val = stack.pop();
                    if (s.charAt(i) == ')' && val != '(') return false;
                    else if (s.charAt(i) == '}' && val != '{') return false;
                    else if (s.charAt(i) == ']' && val != '[') return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
