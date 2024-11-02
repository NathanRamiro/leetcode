package com.nathanramiro.generateParenthesis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GenerateParenthesisTest {

    @Test
    void testGenerateParenthesis() {
        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()").toString(),
                GenerateParenthesis.generateParenthesis(3).toString());

        assertEquals(List.of("()").toString(),
                GenerateParenthesis.generateParenthesis(1).toString());
    }
}
