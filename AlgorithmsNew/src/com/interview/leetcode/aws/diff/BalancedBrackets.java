package com.interview.leetcode.aws.diff;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        String s = "{[()]}";
//        String s = "{[(])}";
//        String s = "{{[[(())]]}}";
        System.out.println(isBalanced(s));
    }

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else {
                if (stack.isEmpty()) return "NO";
                else {
                    char val = stack.pop();
                    if (s.charAt(i) == ')' && val != '(') return "NO";
                    else if (s.charAt(i) == '}' && val != '{') return "NO";
                    else if (s.charAt(i) == ']' && val != '[') return "NO";
                }
            }
        }
        if (stack.isEmpty()) return "YES";
        else return "NO";
    }


}
