package com.nathanramiro.topKFrequentElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequentElementsArray {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> numFrequency = new HashMap<>();
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] topElements = new ArrayList[nums.length];

        for (int currNum : nums) {
            numFrequency.merge(currNum, 1, Integer::sum);
        }

        for (int currkey : numFrequency.keySet()) {

            int position = numFrequency.get(currkey) - 1;
            if (topElements[position] == null) {
                topElements[position]= new ArrayList<>();
            }
            topElements[position].add(currkey);
        }

        int[] result = new int[k];
        int resultPosition = 0;

        for (int index = topElements.length - 1; index >= 0; index--) {
            if (topElements[index] != null) {

                for (Integer currInt : topElements[index]) {

                    result[resultPosition] = currInt;
                    resultPosition++;
                    if (resultPosition == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[] { 1 }, 2)));
    }
}