package com.nathanramiro.defuseTheBomb;

/**
 * You have a bomb to defuse, and your time is running out! Your informer will
 * provide you with a circular array code of length of n and a key k.
 *
 * To decrypt the code, you must replace every number. All the numbers are
 * replaced simultaneously.
 *
 * If k > 0, replace the ith number with the sum of the next k numbers.
 * If k < 0, replace the ith number with the sum of the previous k numbers.
 * If k == 0, replace the ith number with 0.
 *
 * As code is circular, the next element of code[n-1] is code[0], and the
 * previous element of code[0] is code[n-1].
 *
 * Given the circular array code and an integer key k, return the decrypted code
 * to defuse the bomb!
 */

public class DefuseTheBomb {

    public static int[] decrypt(int[] code, int k) {

        int[] res = new int[code.length];

        if (k > 0) {

            res[res.length - 1] = 0;

            for (int i = 0; i < k; i++) {

                res[res.length - 1] += code[i];
            }

            for (int i = code.length - 2; i >= 0; i--) {

                int position = i + k - res.length + 1;
                if (position < 0) {
                    position += res.length;
                }
                res[i] = res[i + 1] + code[i + 1] - code[position];
            }
        }

        if (k < 0) {

            res[0] = 0;

            for (int i = res.length + k; i < res.length; i++) {
                res[0] += code[i];
            }

            for (int i = 1; i < res.length; i++) {

                int position = res.length - 1 + i + k;
                if (position >= res.length) {
                    position -= res.length;
                }
                res[i] = res[i - 1] + code[i - 1] - code[position];
            }
        }

        return res;
    }
}