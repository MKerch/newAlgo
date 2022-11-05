package com.interview.hackerrank.mid;

import java.util.Arrays;
import java.util.List;

public class ChiefHopper {

    public static void main(String[] args) {
        System.out.println(chiefHopper(Arrays.asList(1, 6, 4)));
    }

    public static int chiefHopper(List<Integer> arr) {

        int botEnergy = 4;
        int newBotEnergy = 0;

        for (int i = 0; i < arr.size(); i++) {
            int height = arr.get(i);
            if (botEnergy < arr.get(i)) {
                newBotEnergy = botEnergy - (height - botEnergy);
            } else {
                newBotEnergy = botEnergy + (botEnergy - height);
            }
            botEnergy = newBotEnergy;
        }
        return newBotEnergy;

    }

}
