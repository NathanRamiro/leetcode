package Threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j],
 * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
 * nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * 45,56% runtime 51,33% memory
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> results = new ArrayList<>();

        if (nums.length < 3) {
            return results;
        }

        Arrays.sort(nums);

        for (int low = 0; low < nums.length - 2; low++) {

            if (low != 0 && nums[low - 1] == nums[low]) {
                continue;
            }

            int mid = low + 1;
            int high = nums.length - 1;

            while (mid < high) {
                if (nums[low] + nums[mid] + nums[high] == 0) {
                    results.add(Arrays.asList(nums[low], nums[mid], nums[high]));
                    mid++;
                    while (mid < high && nums[mid] == nums[mid - 1]) {
                        mid++;
                    }
                    continue;
                }
                if (nums[low] + nums[mid] + nums[high] < 0) {
                    mid++;
                    continue;
                }
                if (nums[low] + nums[mid] + nums[high] > 0) {
                    high--;
                    continue;
                }
            }
        }

        return results;
    }

    public static void main(String[] args) {
        System.out.println(
                threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
        // [[-1,-1,2],[-1,0,1]]
        System.out.println(
                threeSum(new int[] { 0, 1, 1 }));
        // []
        System.out.println(
                threeSum(new int[] { 0, 0, 0 }));
        // [0,0,0]
    }

}