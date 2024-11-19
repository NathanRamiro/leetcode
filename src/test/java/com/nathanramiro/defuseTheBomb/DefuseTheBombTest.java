package com.nathanramiro.defuseTheBomb;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class DefuseTheBombTest {

    final int[] code1 = { 5, 7, 1, 4 };
    final int key1 = 3;
    final int[] res1 = { 12, 10, 16, 13 };

    final int[] code2 = { 1, 2, 3, 4 };
    final int key2 = 0;
    final int[] res2 = { 0, 0, 0, 0 };

    final int[] code3 = { 2, 4, 9, 3 };
    final int key3 = -2;
    final int[] res3 = { 12, 5, 6, 13 };

    @Test
    void testDecrypt() {

        assertArrayEquals(res1, DefuseTheBomb.decrypt(code1, key1));
        assertArrayEquals(res2, DefuseTheBomb.decrypt(code2, key2));
        assertArrayEquals(res3, DefuseTheBomb.decrypt(code3, key3));
    }
}
