package tasks;

public class FindEvenIndex {

    public static int findEvenIndex(int[] arr) {
        int totalSum = 0;
        int rightSum = 0;
        for (int i : arr) {
            totalSum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            if((totalSum - arr[i] - rightSum) == rightSum) {
                return i;
            } else {
                rightSum += arr[i];
            }

        }
        return -1;
    }
}
