package com.nathanramiro.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate Parenthesis
 * 
 * Given n pairs of parentheses, write a function to
 * generate all combinations of well-formed parentheses.
 * 
 * 1 <= n <= 8
 */

public class GenerateParenthesis {

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();

        buildString(n, 0, 0, res, "");

        return res;
    }

    public static void buildString(int n, int left, int right, List<String> res, String string) {

        if (string.length() == n * 2) {
            res.add(string);
            return;
        }

        if (left < n) {
            buildString(n, left + 1, right, res, string + '(');
        }

        if (left > right) {
            buildString(n, left, right + 1, res, string + ')');
        }

    }
}
