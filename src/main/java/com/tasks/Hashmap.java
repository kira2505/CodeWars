package com.tasks;

import java.util.*;

public class Hashmap {

    public static void main(String[] args) {
        List<String> colors = List.of("red", "pink", "white", "yellow", "red", "black");

        Map<String, Integer> sorted = new HashMap<>();

        for( String s : colors) {
            sorted.put(s, sorted.getOrDefault(s, 0) + 1);
        }

        System.out.println(sorted);

        Iterator<Map.Entry<String, Integer>> iterator = sorted.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();

            if (next.getValue() % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println(sorted);
    }
}
