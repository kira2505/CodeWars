package tasks;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int pair = target - numbers[i];
            if (map.containsKey(pair)) {
                return new int[]{map.get(pair), i};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
