package com.tasks;

public class LongToIP {

    public static String longToIP(long ip) {
        long one = ip >> 24 & 0xFF;
        long two = ip >> 16 & 0xFF;
        long three = ip >> 8 & 0xFF;
        long four = ip & 0xFF;
        return one + "." + two + "." + three + "." + four;
    }
}
