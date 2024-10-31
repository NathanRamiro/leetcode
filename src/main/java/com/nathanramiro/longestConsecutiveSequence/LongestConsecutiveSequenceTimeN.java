package com.nathanramiro.longestConsecutiveSequence;

import java.util.HashSet;

public class LongestConsecutiveSequenceTimeN {
    public static int longestConsecutive(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }

        int result = 1;
        HashSet<Integer> numSet = new HashSet<>(nums.length);
        for (int currInt : nums) {
            numSet.add(currInt);
        }
        for (int currInt : numSet) {
            if (!numSet.contains(currInt - 1)) {
                int index = 1, currSequence = 1;
                while (numSet.contains(currInt + index)) {
                    index++;
                    currSequence++;
                }
                if (currSequence > result) {
                    result = currSequence;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                longestConsecutive(
                        new int[] { 1, 2, 0, 1 }));// 3
    }

}