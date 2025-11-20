package tasks;

public class FindOutlier {

    static int find(int[] integers) {
        int odd = 0;
        int even = 0;
        int indexOdd = 0;
        int indexEven = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                even++;
                indexEven = i;
            }else {
                odd++;
                indexOdd = i;
            }
        }

        if (odd < even) {
            return integers[indexOdd];
        }
        return integers[indexEven];
    }
}
