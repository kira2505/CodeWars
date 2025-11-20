package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {
        List<String> colors = List.of("red", "pink", "white", "yellow", "red", "black");

        Map<String, Integer> sorted = new HashMap<>();

        for( String s : colors) {
            sorted.put(s, sorted.getOrDefault(s, 0) + 1);
        }

        System.out.println(sorted);

        List<String> withPair = new ArrayList<>();

        sorted.forEach((k, v ) -> {
            if(v >=2) {
                withPair.add(k);
            }
        } );

        System.out.println(withPair);

    }
}
