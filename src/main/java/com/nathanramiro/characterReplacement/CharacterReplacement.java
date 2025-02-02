package com.nathanramiro.characterReplacement;

/**
 * You are given a string s and an integer k. You can choose any character of
 * the string and change it to any other uppercase English character. You can
 * perform this operation at most k times.
 * 
 * Return the length of the longest substring containing the same letter you can
 * get after performing the above operations.
 */

public class CharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int res = 0;
        int[] charArray = new int[26];
        int charFrequency = 0;

        for (int left = 0, right = 0; right < s.length(); right++) {
            charArray[s.charAt(right) - 65]++;
            charFrequency = Math.max(charFrequency, charArray[s.charAt(right) - 65]);

            if ((right - left + 1) - charFrequency > k) {
                charArray[s.charAt(left) - 65]--;
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}