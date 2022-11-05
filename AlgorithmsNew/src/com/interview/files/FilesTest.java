package com.interview.files;

import java.io.*;

public class FilesTest {
    public static void main(String[] args) throws IOException {
        String fileName = "d://lines.txt";
        InputStream fis = new FileInputStream(fileName);
        System.out.println(readFromInputStream(fis));

//        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
//            stream.forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    private static String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }


}
