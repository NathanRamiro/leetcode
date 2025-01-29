package com.nathanramiro.maxProfit;

public class MaxProfit {

    public static int maxProfit(int[] prices) {

        int lowestPrice = prices[0];
        int profit = 0;

        for (int currPrice : prices) {
            if (currPrice < lowestPrice) {
                lowestPrice = currPrice;
                continue;
            }
            profit = Math.max(profit, currPrice - lowestPrice);
        }

        return profit;
    }
}