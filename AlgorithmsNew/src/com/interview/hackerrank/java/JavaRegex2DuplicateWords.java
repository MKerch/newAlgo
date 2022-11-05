package com.interview.hackerrank.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class JavaRegex2DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)";
        String regex2 = "\\\\b(\\\\w+)(\\\\s+\\\\1\\\\b)+";
//        String regex2 = "[^(\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b))]";
        Pattern p = Pattern.compile(regex, CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);
            m.group();

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(regex, "");
            }
            boolean b = m.find();
            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }

}
