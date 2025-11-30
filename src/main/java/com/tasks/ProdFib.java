package com.tasks;

import java.util.ArrayList;
import java.util.List;

public class ProdFib {

    public static long[] productFib(long prod) {
        long[] result = new long[]{0,1,0};

        while (result[0] * result[1] < prod) {
            long target = result[0];
            result[0] = result[1];
            result[1] = target + result[1];

            if (result[0] * result[1] == prod) {
                result[2] = 1;
            }
        }
        return result;
    }
}
