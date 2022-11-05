package com.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class iterateMap {


    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Hi", "Me");
        map.put("She", "Me");
        show2(map);
    }

    private static void show(HashMap<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void show2(HashMap<String, String> map) {
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> set : entries) {
            System.out.println(set.getKey() + "=" + set.getValue());
        }

    }


}
