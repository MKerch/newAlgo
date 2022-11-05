package com.interview.hackerrank.java;

import java.util.Scanner;

public class JavaStdinandStdoutII {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = "";
        while(scan.nextLine().equals("exit")){
            s += scan.next().concat(" ");
        }

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
