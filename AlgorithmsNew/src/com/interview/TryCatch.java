package com.interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("")) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
