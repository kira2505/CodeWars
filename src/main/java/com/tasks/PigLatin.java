package com.tasks;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {

    public static String pigIt(String str) {
        String[] strings = str.split(" ");
        return Arrays.stream(strings)
                .map(s -> {
                    if (Character.isLetter(s.charAt(0))) {
                        return s.substring(1) + s.charAt(0) + "ay";
                    } else {
                        return s;
                    }
                })
                .collect(Collectors.joining(" "));
    }
}
