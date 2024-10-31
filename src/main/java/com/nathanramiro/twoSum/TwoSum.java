package com.nathanramiro.twoSum;

import java.util.Arrays;

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] res = { -1, -1 };

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] <= target || (nums[i] > target && target < 0) || target == 0) {

                int pos = -1;
                if (target == 0) {
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == -nums[i]) {
                            pos = j;
                            break;
                        }
                    }
                } else if (target == nums[i]) {
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == 0) {
                            pos = j;
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == target - nums[i]) {
                            pos = j;
                            break;
                        }
                    }
                }

                if (pos >= 0 && pos != i) {

                    res = new int[] { pos, i };
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, -3, 4, -1 };
        int[] res = twoSum(nums, -1);
        System.out.println(Arrays.toString(res));
    }
}