package com.interview.Test;

import java.util.HashSet;
import java.util.Set;

public class DoubleBraseInitialisation {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<String>(){{
            add("She");
            add("He");
        }};
        System.out.println(stringSet);
    }

}
