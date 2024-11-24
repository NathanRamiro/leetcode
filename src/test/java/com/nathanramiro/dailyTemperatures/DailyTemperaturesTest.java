package com.nathanramiro.dailyTemperatures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class DailyTemperaturesTest {

    private final int[] arr1 = new int[] { 73, 74, 75, 71, 69, 72, 76, 73 };
    private final int[] arr1Res = new int[] { 1, 1, 4, 2, 1, 1, 0, 0 };

    private final int[] arr2 = new int[] { 30, 40, 50, 60 };
    private final int[] arr2Res = new int[] { 1, 1, 1, 0 };

    private final int[] arr3 = new int[] { 30, 60, 90 };
    private final int[] arr3Res = new int[] { 1, 1, 0 };

    @Test
    void testDailyTemperatures() {

        assertEquals(Arrays.toString(arr1Res),
                Arrays.toString(DailyTemperatures.dailyTemperatures(arr1)));

        assertEquals(Arrays.toString(arr2Res),
                Arrays.toString(DailyTemperatures.dailyTemperatures(arr2)));

        assertEquals(Arrays.toString(arr3Res),
                Arrays.toString(DailyTemperatures.dailyTemperatures(arr3)));
    }
}
