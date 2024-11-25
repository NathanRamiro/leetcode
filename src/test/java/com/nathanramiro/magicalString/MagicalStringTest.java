package com.nathanramiro.magicalString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MagicalStringTest {
    @Test
    void testMagicalString() {
        assertEquals(3, MagicalString.magicalString(6));
        assertEquals(1, MagicalString.magicalString(1));
    }
}
