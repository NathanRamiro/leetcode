package com.nathanramiro.dailyTemperatures;

import java.util.ArrayDeque;

/**
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to
 * wait after the i-th day to get a warmer temperature. If there is no future
 * day
 * for which this is possible, keep answer[i] == 0 instead.
 */

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() && temperatures[stack.getFirst()] < temperatures[i]) {
                res[stack.getFirst()] = i - stack.removeFirst();
            }
            stack.addFirst(i);
        }

        return res;
    }
}