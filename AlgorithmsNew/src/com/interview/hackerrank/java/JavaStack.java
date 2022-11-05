package com.interview.hackerrank.java;

import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {

        String s = "[{()}]";
        System.out.println(balanced(s));

    }

    private static boolean balanced(String s) {
        if (s.isEmpty()) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            Character top = stack.peek();
            char current = s.charAt(i);
            if (top == '(' && current == ')' ||
                    top == '{' && current == '}' ||
                    top == '[' && current == ']') {
                stack.pop();
            } else stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }


}
