package com.nathanramiro.permutationInString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckInclusionTest {

    String[] s1 = {
            "ab",
            "ab"
    };
    String[] s2 = {
            "eidbaooo",
            "eidboaoo"
    };
    boolean[] res = {
            true,
            false,
    };

    @Test
    void testCheckInclusion() {

        for (int i = 0; i < res.length; i++) {
            System.out.println("test: " + i);
            assertEquals(res[i],
                    CheckInclusion.checkInclusion(s1[i], s2[i]));
        }
    }
}
