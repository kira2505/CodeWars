package com.tasks;

import java.util.ArrayList;
import java.util.Collections;

public class SortOddNums {

    public static int[] sortArray(int[] array) {
        ArrayList<Integer> temp = new ArrayList<>();
        int index = 0;

        for (int i :  array) {
            if(i%2!=0){
                temp.add(i);
            }
        }
        Collections.sort(temp);
        index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                array[i] = temp.get(index++);
            }
        }
        return array;
    }
}
