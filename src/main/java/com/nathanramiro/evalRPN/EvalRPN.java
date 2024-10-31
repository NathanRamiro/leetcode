package com.nathanramiro.evalRPN;

import java.util.ArrayDeque;

/**
 * EvalRPN
 * 
 * You are given an array of strings tokens that represents an arithmetic
 * expression in a Reverse Polish Notation.
 * 
 * Evaluate the expression. Return an integer that represents the value of the
 * expression.
 * 
 * Note that:
 * 
 * The valid operators are '+', '-', '*', and '/'.
 * Each operand may be an integer or another expression.
 * The division between two integers always truncates toward zero.
 * There will not be any division by zero.
 * The input represents a valid arithmetic expression in a reverse polish
 * notation.
 * The answer and all the intermediate calculations can be represented in a
 * 32-bit integer.
 * 
 */
public class EvalRPN {

    public static int evalRPN(String[] tokens) {

        ArrayDeque<Integer> stack = new ArrayDeque<>(tokens.length);
        int num = 0;

        for (String currToken : tokens) {
            switch (currToken) {
                case "+":
                    stack.addFirst(stack.removeFirst() + stack.removeFirst());
                    break;

                case "-":
                    num = stack.removeFirst();
                    stack.addFirst(stack.removeFirst() - num);
                    break;

                case "/":
                    num = stack.removeFirst();
                    stack.addFirst(stack.removeFirst() / num);
                    break;

                case "*":
                    stack.addFirst(stack.removeFirst() * stack.removeFirst());
                    break;

                default:
                    stack.addFirst(Integer.parseInt(currToken));
                    break;
            }
        }

        return stack.getFirst();
    }
}