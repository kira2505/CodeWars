package tasks;

import java.util.*;

public class PangramChecker {

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog"));
    }

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
