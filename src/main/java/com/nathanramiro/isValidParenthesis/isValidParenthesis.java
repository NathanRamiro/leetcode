package com.nathanramiro.isValidParenthesis;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * - Open brackets must be closed by the same type of brackets.
 * - Open brackets must be closed in the correct order.
 * - Every close bracket has a corresponding open bracket of the same type.
 */

public class isValidParenthesis {
    public static boolean isValid(String s) {

        if ((s.length() & 1) == 1) { // check if odd
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char currChar : s.toCharArray()) {

            switch (currChar) {
                case '{', '[', '(':
                    stack.push(currChar);
                    break;

                default:
                    try {
                        switch (stack.pop()) {
                            case '{':
                                if (currChar != '}') {
                                    return false;
                                }
                                break;

                            case '[':
                                if (currChar != ']') {
                                    return false;
                                }
                                break;

                            case '(':
                                if (currChar != ')') {
                                    return false;
                                }
                                break;
                        }
                    } catch (EmptyStackException e) {
                        return false;
                    }
                    break;
            }
        }

        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid(new String(
                "()[]{}")));// true
        System.out.println(isValid(new String(
                "(]")));// false
        System.out.println(isValid(new String(
                "([])")));// true
        System.out.println(isValid(new String(
                "((")));// false
        System.out.println(isValid(new String(
                "){")));// false

    }
}
