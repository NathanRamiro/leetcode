package com.nathanramiro.magicDictionary;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Design a data structure that is initialized with a list of different words.
 * Provided a string, you should determine if you can change exactly one
 * character in this string to match any word in the data structure.
 */

public class MagicDictionary {

    HashMap<Integer, ArrayList<String>> sizeMap;

    /**
     * Initializes the object.
     */
    public MagicDictionary() {
        this.sizeMap = new HashMap<>();
    }

    /**
     * Sets the data structure
     *
     * @param dictionary - an <code>array</code> of
     *                   distinct Strings
     */
    public void buildDict(String[] dictionary) {
        for (String currStr : dictionary) {
            ArrayList<String> currArrayList = sizeMap.get(currStr.length());

            if (currArrayList == null) {
                currArrayList = new ArrayList<>();
                currArrayList.add(currStr);
                sizeMap.put(currStr.length(), currArrayList);
                continue;
            }

            currArrayList.add(currStr);
        }
    }

    /**
     * searches for a word that is a single character away from the provided searchWord
     *
     * @param searchWord - the <code>String</code> to be searched
     * @return <code>true</code> if you can change exactly one
     *         character in searchWord to match any string in the data structure,
     *         otherwise
     *         returns <code>false</code>.
     */
    public boolean search(String searchWord) {

        ArrayList<String> wordList = sizeMap.get(searchWord.length());

        if (wordList == null) {
            return false;
        }

        boolean hasError = false;

        for (String currStr : wordList) {
            for (int i = 0; i < searchWord.length(); i++) {
                if (searchWord.charAt(i) != currStr.charAt(i)) {
                    if (hasError) {
                        hasError = false;
                        break;
                    } else {
                        hasError = true;
                    }
                }
            }
            if (hasError) {
                return true;
            }
        }
        return false;
    }
}