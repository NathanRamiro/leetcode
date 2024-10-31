package com.nathanramiro.twoSum2;

import java.util.Arrays;

/**
 * Twosum2
 * Given a 1-indexed array of integers numbers that is already sorted in
 * non-decreasing order, find two numbers such that they add up to a specific
 * target number. Let these two numbers be numbers[index1] and numbers[index2]
 * where 1 <= index1 < index2 <= numbers.length.
 * 
 * Return the indices of the two numbers, index1 and index2, added by one as an
 * integer array [index1, index2] of length 2.
 * 
 * The tests are generated such that there is exactly one solution. You may not
 * use the same element twice.
 * 
 * Your solution must use only constant extra space.
 * 
 * no Arrays.binarySearch were hurt during the creation of this function
 * 
 * most solutions solve this in 2ms, this one uses 3ms
 * most solutions seem to have O(N), this version has O(LogN)
 */
public class Twosum2 {
    public static int[] twoSum2(int[] numbers, int target) {

        if (numbers.length < 3) {
            return new int[] { 1, 2 };
        }

        for (int currNum = 0; true; currNum++) {
            int low = 0;
            int high = numbers.length - 1;
            while (low <= high) {
                int mid = low + high >>> 1;
                int midVal = numbers[mid];
                if (midVal < target - numbers[currNum]) {
                    low = mid + 1;
                } else {
                    if (midVal <= target - numbers[currNum] && mid != currNum) {
                        if (currNum <= mid) {
                            return new int[] { currNum + 1, mid + 1 };
                        } else {
                            return new int[] { mid + 1, currNum + 1 };
                        }
                    }

                    high = mid - 1;
                }
            }
        }
    }

    public static int[] test(int[] nums, int target) {
        for (int currNum = 0; true; currNum++) {
            int high = Arrays.binarySearch(nums, target - currNum);
            if (high > 0) {
                return new int[] { currNum + 1, high + 1 };
            }
        }
    }

    public static void main(String[] args) {
        /*
         * System.out.println(Arrays.toString(test(new int[] { 1, 2, 3, 4, 4, 9, 56, 90
         * }, 8)));
         */
        System.out.println(
                Arrays.toString(
                        twoSum2(new int[] { 1, 2, 3, 4, 4, 9, 56, 90 }, 8)));
        // [4,5] //time limit exceeded
        System.out.println(
                Arrays.toString(
                        twoSum2(new int[] { 2, 7, 11, 15 }, 9)));
        // [1,2]
        System.out.println(
                Arrays.toString(
                        twoSum2(new int[] { 2, 3, 4 }, 6)));
        // [1,3]
        System.out.println(
                Arrays.toString(
                        twoSum2(new int[] { -1, 0 }, -1)));
        // [1,2]
    }
}