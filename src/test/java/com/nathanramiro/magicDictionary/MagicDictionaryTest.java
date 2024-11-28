package com.nathanramiro.magicDictionary;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MagicDictionaryTest {
    @Test
    void testSearch() {
        MagicDictionary magicDictionary = new MagicDictionary();
        magicDictionary.buildDict(new String[] { "hello", "leetcode" });
        assertFalse(magicDictionary.search("hello"));
        assertTrue(magicDictionary.search("hhllo"));
        assertFalse(magicDictionary.search("hell"));
        assertFalse(magicDictionary.search("leetcoded"));
    }
}
