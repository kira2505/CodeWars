package com.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class TopWords {

    public static List<String> top3(String s) {
        Map<String, Integer> map = new HashMap<>();
        String[] strings = s.toLowerCase().split("[^a-z']+");
        for (String string : strings) {
            if (string.isEmpty() || string.replace("'", "").isEmpty())
                continue;

            map.put(string, map.getOrDefault(string, 0) + 1);
        }

        return map.entrySet()
                .stream()
                .sorted((k, v) -> Integer.compare(k.getValue(), v.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
