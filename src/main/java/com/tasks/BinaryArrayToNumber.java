package tasks;

import java.util.List;
import java.util.stream.Collectors;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String binaryString = binary.stream()
                .map(i -> String.valueOf(i))
                .collect(Collectors.joining());

        return Integer.valueOf(binaryString, 2);
    }
}
