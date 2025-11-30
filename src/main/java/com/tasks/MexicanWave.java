package com.tasks;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!= ' ') {
                StringBuilder sb = new StringBuilder(str.toLowerCase());
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                result.add(sb.toString());
            }
        }

        return result.toArray(new String[0]);
    }

}
