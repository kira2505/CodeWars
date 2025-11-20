package com.tasks;

public class Snail {

    public static int[] snail(int[][] array) {
        int[] sorted =  new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sorted[i] = array[i][j];
            }
        }
    }
}
