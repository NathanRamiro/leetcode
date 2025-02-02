package com.nathanramiro.characterReplacement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterReplacementTest {

    final String[] s = {
            "ABAB",
            "AABABBA",
            "AAAB",
            "AABA",
            "BAAA"
    };
    final int[] k = {
            2,
            1,
            0,
            0,
            0
    };
    final int[] res = {
            4,
            4,
            3,
            2,
            3
    };

    @Test
    void testCharacterReplacement() {

        assertEquals(res[0],
                CharacterReplacement.characterReplacement(s[0], k[0]));
        assertEquals(res[1],
                CharacterReplacement.characterReplacement(s[1], k[1]));
        assertEquals(res[2],
                CharacterReplacement.characterReplacement(s[2], k[2]));
        assertEquals(res[3],
                CharacterReplacement.characterReplacement(s[3], k[3]));
        assertEquals(res[4],
                CharacterReplacement.characterReplacement(s[4], k[4]));
    }
}
