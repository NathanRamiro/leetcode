package com.nathanramiro.lengthOfLongestSubstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LengthOfLongestSubstringTest {

    final String string1 = "abcabcbb";
    final int res1 = 3;

    final String string2 = "bbbbb";
    final int res2 = 1;

    final String string3 = "pwwkew";
    final int res3 = 3;

    final String string4 = "anviaj";
    final int res4 = 5;

    @Test
    void testLengthOfLongestSubstring() {

        assertEquals(res1,
                LengthOfLongestSubstring.lengthOfLongestSubstring(string1));
        assertEquals(res2,
                LengthOfLongestSubstring.lengthOfLongestSubstring(string2));
        assertEquals(res3,
                LengthOfLongestSubstring.lengthOfLongestSubstring(string3));
        assertEquals(res4,
                LengthOfLongestSubstring.lengthOfLongestSubstring(string4));
    }
}
