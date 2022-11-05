package com.interview.hackerrank.basic;

public class TaumAndBday {

    public static void main(String[] args) {

    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        if (bc > wc && wc + z < bc) {
            int updatedP = wc + z;
            return ((long) b * updatedP) + ((long) w * wc);
        } else if (bc < wc && bc + z < wc) {
            int updatedP = bc + z;
            return ((long) b * bc) + ((long) w * updatedP);
        }
        return ((long) b * bc) + ((long) w * wc);
    }

}
