package com.nathanramiro.containerWithMostWater;

/**
 * ContainerWithMostWater
 * 
 * You are given an integer array height of length n. There are n vertical lines
 * drawn such that the two endpoints of the ith line are (i, 0) and
 * (i,height[i]).
 * 
 * Find two lines that together with the x-axis form a container, such that the
 * container contains the most water.
 * 
 * Return the maximum amount of water a container can store.
 * 
 * Notice that you may not slant the container.
 * 
 * ps: the tests expect the container width to be calculated as (lenght - 1)
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int low = 0;
        int high = height.length - 1;
        int currWater = 0;
        int result = 0;

        while (low < high) {

            if (height[low] < height[high]) {
                currWater = height[low] * (high - low);
                low++;
            } else {
                currWater = height[high] * (high - low);
                high--;
            }

            if (currWater > result) {
                result = currWater;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {
                1, 8, 6, 2, 5, 4, 8, 3, 7 }));
        // 49
        System.out.println(maxArea(new int[] {
                1, 1 }));
        // 1
    }
}