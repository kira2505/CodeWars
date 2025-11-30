package com.tasks;

import java.math.BigInteger;

public class AddingBigNumbers {

    public static String addWithCheat(String a, String b) {
        return String.valueOf(new BigInteger(a).add(new BigInteger(b)));
    }

}
