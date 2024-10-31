package com.nathanramiro.isValidSudoku;

import java.util.HashMap;
import java.util.HashSet;

public class IsValidSudoku {
    public static boolean isValidSudoku(char[][] board) {

        char currChar;
        HashSet<Character> rowSet = new HashSet<>(9);
        HashSet<Character> colSet = new HashSet<>(9);
        HashMap<String, HashSet<Character>> sectionMap = new HashMap<>(9);
        for (byte ix, iy = 0; iy < 3; iy++) {
            for (ix = 0; ix < 3; ix++) {
                sectionMap.put(iy + "" + ix, new HashSet<>(9));
            }
        }

        for (byte index = 0; index < 9; index++) {
            rowSet.clear();
            colSet.clear();
            for (byte indexX = 0; indexX < 9; indexX++) {
                currChar = board[index][indexX];
                if (currChar == '.') {
                    continue;
                }
                if (rowSet.contains(currChar)) {

                    return false;
                }
                if (sectionMap.get((index / 3) + "" + (indexX / 3))
                        .contains(currChar)) {

                    return false;
                }

                rowSet.add(currChar);
                sectionMap.get((index / 3) + "" + (indexX / 3))
                        .add(currChar);

            }
            for (byte indexY = 0; indexY < 9; indexY++) {
                currChar = board[indexY][index];
                if (currChar == '.') {
                    continue;
                }
                if(colSet.contains(currChar)){
                    return false;
                }
                colSet.add(currChar);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidSudoku(new char[][] { // true
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } }));
    }

}