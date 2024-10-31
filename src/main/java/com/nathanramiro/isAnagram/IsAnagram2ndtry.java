package com.nathanramiro.isAnagram;

import java.util.Arrays;

public class IsAnagram2ndtry {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sLetters = s.toCharArray();
        char[] tLetters = t.toCharArray();

        Arrays.sort(sLetters);        
        Arrays.sort(tLetters);
        
        for (int i = 0; i < sLetters.length; i++) {
            if (sLetters[i]!=tLetters[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        long before = System.currentTimeMillis();
        boolean res = isAnagram("anagramas", "nagaramas");
        System.out.println(res);
        System.out.println(System.currentTimeMillis() - before);
    }
}
