package com.nathanramiro.containsDuplicate;

import java.util.HashSet;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int number:nums){
            if (hashSet.contains(number)) {
                return true;
            }
            hashSet.add(number);

        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        long start = System.currentTimeMillis();
        System.out.println(containsDuplicate(nums));
        System.out.println(System.currentTimeMillis()-start);
        
    }

}