package com.nathanramiro.groupAnagrams;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {//slow

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> resultList = new ArrayList<>();

        for (String currstring : strs) {
            if (currstring != null) {
                resultList.add(findGroup(strs, currstring));
            }
        }

        return resultList;
    }

    public static List<String> findGroup(String[] strs, String word) {
        List<String> group = new ArrayList<>();

        byte[] chars = new byte[26];
        for (char c : word.toCharArray()) {
            chars[c - 97]++;
        }

        for (short i = 0; i < strs.length; i++) {

            String currString = strs[i];

            if (currString == null) {
                continue;
            }
            if (currString.length() != word.length()) {
                continue;
            }
            if (currString.equals(word)) {

                group.add(currString);
                strs[i] = null;
                continue;
            }

            byte[] charscpy = chars.clone();
            boolean notAnagram = false;

            for (char currChar : currString.toCharArray()) {

                charscpy[currChar - 97]--;
                if (charscpy[currChar - 97] < 0) {
                    notAnagram = true;
                    break;
                }
            }
            if (notAnagram) {
                continue;
            }

            group.add(currString);
            strs[i] = null;
        }

        return group;
    }

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        System.out.println(
                groupAnagrams(new String[] { "", "eat", "tea", "tan", "ate", "nat", "bat", "", "" }));
        System.out.println(System.currentTimeMillis() - now);
    }

}
