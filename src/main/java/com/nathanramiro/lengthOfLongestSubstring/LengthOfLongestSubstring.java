package com.nathanramiro.lengthOfLongestSubstring;

import java.util.HashSet;

/**
 * Given a string s, find the length of the longest
 * substring without repeating characters.
 */

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        int res = 0;
        HashSet<Character> chars = new HashSet<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            if (!chars.add(s.charAt(right))) {
                res = Math.max(res, chars.size());

                do {
                    chars.remove(s.charAt(left++));
                } while (!chars.add(s.charAt(right)));
            }
        }
        res = Math.max(res, chars.size());

        return res;
    }
}