package com.tasks;

import java.util.*;

public class ObservedPin {

    public static List<String> getPINs(String observed) {
        Map<Integer, List<Integer>> variables = new HashMap<>();
        variables.put(1, Arrays.asList(1, 2, 4));
        variables.put(2, Arrays.asList(1, 2, 3, 5));
        variables.put(3, Arrays.asList(2, 3, 6));
        variables.put(4, Arrays.asList(1, 4, 5, 7));
        variables.put(5, Arrays.asList(2, 4, 5, 6, 8));
        variables.put(6, Arrays.asList(3, 5, 6, 9));
        variables.put(7, Arrays.asList(4, 7, 8));
        variables.put(8, Arrays.asList(0, 5, 7, 8, 9));
        variables.put(9, Arrays.asList(6, 8, 9));
        variables.put(0, Arrays.asList(0, 8));

        List<String> result = new ArrayList<>();
        result.add("");

        for (char c : observed.toCharArray()) {
            int num = Character.getNumericValue(c);
            List<Integer> variants = variables.get(num);
            List<String> newResult = new ArrayList<>();

            for(String s : result){
                for(int i : variants){
                    newResult.add(s + i);
                }
            }

            result = newResult;
        }
        return result;
    }
}
