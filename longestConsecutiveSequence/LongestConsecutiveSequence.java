package longestConsecutiveSequence;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }

        int currSequence = 1;
        int result = 1;
        Arrays.sort(nums);

        for (int index = 1; index < nums.length; index++, currSequence++) {
            if (nums[index] == nums[index - 1]) {
                currSequence--;
                continue;
            }
            if (nums[index] != nums[index - 1] + 1) {

                if (currSequence > result) {
                    result = currSequence;
                }
                currSequence = 0;
            }
        }
        if (currSequence > result) {
            result = currSequence;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                longestConsecutive(
                        new int[] { 1, 2, 0, 1 }));// 3
    }

}