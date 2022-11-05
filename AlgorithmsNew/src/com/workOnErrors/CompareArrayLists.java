package com.workOnErrors;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayLists {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("His");
        List<String> list2 = new ArrayList<>();
        list2.add("Hi");
        System.out.println(list.equals(list2));
        System.out.println(list.hashCode());
        System.out.println(list2.hashCode());
    }

}
