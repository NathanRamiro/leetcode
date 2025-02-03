package com.nathanramiro.permutationInString;

import java.util.Arrays;

/**
 * Given two strings s1 and s2, return true if s2 contains a
 * permutation
 * of s1, or false otherwise.
 * 
 * In other words, return true if one of s1's permutations is the substring of
 * s2.
 */

public class CheckInclusion {

    /*
     * like in character replacement sliding window
     * start both left get character array for s1
     * expand window until size of s1, move right until match
     * if s1 char array and window char array equal return true
     */

    public static boolean checkInclusion(String s1, String s2) {

        int[] s1Chars = new int[26];
        int[] windowChars = new int[26];

        for (char currChar : s1.toCharArray()) {
            s1Chars[currChar - 97]++;
        }

        for (int left = 0, right = 0; right < s2.length(); right++) {
            windowChars[s2.charAt(right) - 97]++;
            if (right - left + 1 != s1.length()) {
                continue;
            }
            if (Arrays.equals(s1Chars, windowChars)) {
                return true;
            }
            windowChars[s2.charAt(left++) - 97]--;
        }

        return false;
    }
}