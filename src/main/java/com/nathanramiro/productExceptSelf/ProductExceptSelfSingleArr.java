package com.nathanramiro.productExceptSelf;

import java.util.Arrays;

public class ProductExceptSelfSingleArr {

    public static int[] productExceptSelfSingleArr(int[] nums) {

        int[] result = new int[nums.length];

        for (int index = 0, currProd = 1; index < result.length; index++) {
            result[index] = currProd;
            currProd *= nums[index];
        }
        for (int index = result.length - 1, currProd = 1; index >= 0; index--) {
            result[index] *= currProd;
            currProd *= nums[index];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        productExceptSelfSingleArr(
                                new int[] { 1, 2, 3, 4 })));

    }

}