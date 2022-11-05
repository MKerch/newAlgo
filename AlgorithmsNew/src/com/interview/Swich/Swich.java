package com.interview.Swich;

public class Swich {
    public static void main(String[] args) {
        Test end = Test.END;
        switch (end) {
            case END:
                System.out.println("End");
                break;
            case START:
                System.out.println("START");
                break;
            case STOP:
                System.out.println("STOP");
                break;
            default:
                System.out.println("error");
                break;
        }
    }

}
