package com.nathanramiro.maxProfit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxProfitTest {

    final int[] prices1 = { 7, 1, 5, 3, 6, 4 };
    final int res1 = 5;

    final int[] prices2 = { 7, 6, 4, 3, 1 };
    final int res2 = 0;

    @Test
    void testMaxProfit() {

        assertEquals(res1, MaxProfit.maxProfit(prices1));
        assertEquals(res2, MaxProfit.maxProfit(prices2));
    }
}
