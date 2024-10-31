package com.nathanramiro.topKFrequentElements;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> numFrequency = new HashMap<>();
        ArrayList<ArrayList<Integer>> topElements = new ArrayList<>(nums.length);
        for (int index = 0; index < nums.length; index++) {
            topElements.add(null);
        }

        for (int currNum : nums) {
            numFrequency.merge(currNum, 1, Integer::sum);
        }

        for (int currkey : numFrequency.keySet()) {

            int position = numFrequency.get(currkey) - 1;
            if (topElements.get(position) == null) {
                topElements.set(position, new ArrayList<>());
            }
            topElements.get(position).add(currkey);
        }

        int[] result = new int[k];
        int resultPosition = 0;

        for (int index = topElements.size() - 1; index >= 0; index--) {
            if (topElements.get(index) != null) {

                for (Integer currInt : topElements.get(index)) {

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