package com.interview.hackerrank.mid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FraudulentActivityNotifications {

    //TODO time out of limit
    public static void main(String[] args) {

        System.out.println(activityNotifications(Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5), 5));

    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int notificationsCount = 0;
        for (int i = 0; i < expenditure.size() - d; i ++) {
            List<Integer> cut = expenditure.subList(i, i + d);
            int mid = getMid(cut);
            if ((i + d) < expenditure.size()) {
                Integer nextDay = expenditure.get(i + d);
                if (nextDay >= 2 * mid) notificationsCount++;
            }
        }
        return notificationsCount;
    }

    private static int getMid(List<Integer> cut) {
        Collections.sort(cut);
        int mid = 0;
        if (cut.size() % 2 != 0) mid = cut.get(cut.size() / 2);
        else mid = (cut.get(cut.size() / 2) + cut.get(cut.size() / 2 + 1)) / 2;
        return mid;
    }



}
