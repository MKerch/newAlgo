package com.interview.hackerrank.java;

public class JavaInterface {

    public static void main(String[] args) {
        System.out.println(deviders(6));
    }

    public static int deviders(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0) sum+=i;
        }
        return sum;
    }

}
