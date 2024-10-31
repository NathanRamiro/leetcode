package com.nathanramiro.evalRPN;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvalRPNTest {

    final String[] string1 = { "2", "1", "+", "3", "*" };// 9
    final String[] string2 = { "4", "13", "5", "/", "+" };// 6
    final String[] string3 = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };// 22

    @Test
    public void evalRPN() {

        assertEquals(EvalRPN.evalRPN(string1), 9);
        assertEquals(EvalRPN.evalRPN(string2), 6);
        assertEquals(EvalRPN.evalRPN(string3), 22);
    }
}
