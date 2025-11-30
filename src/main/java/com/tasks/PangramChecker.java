package com.tasks;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public static boolean check(String sentence){
        Set<Character> words = new HashSet<>();
        for(char c : sentence.toLowerCase().toCharArray()){
            if(Character.isLetter(c)) {
                words.add(c);
            }
        }
        if (words.size() == 26) {
            return true;
        }
        return false;
    }
}
