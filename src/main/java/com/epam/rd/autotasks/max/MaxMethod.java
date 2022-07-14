package com.epam.rd.autotasks.max;

public class MaxMethod {

    public static int max(int[] values) {
        // throw new UnsupportedOperationException();

        int maxValue = values[0];
        for (int value : values) {
            if (maxValue < value) {
                maxValue = value; }
            }
        return maxValue;


    }



}
