package com.nathanramiro.isValidSudoku;

import java.util.HashSet;

public class IsValidSudokuNoMap {
    public static boolean isValidSudoku(char[][] board) {

        @SuppressWarnings("unchecked")
        HashSet<Character>[][] sectionSets = new HashSet[3][3];
        HashSet<Character> rowSet = new HashSet<>(9);
        HashSet<Character> colSet = new HashSet<>(9);
        char currChar;

        for (byte ix, iy = 0; iy < 3; iy++) {
            for (ix = 0; ix < 3; ix++) {
                sectionSets[iy][ix]= new HashSet<>(9);
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
                if (!rowSet.add(currChar)) {

                    return false;
                }
                if (!sectionSets[index/3][indexX/3]
                        .add(currChar)) {

                    return false;
                }
            }
            for (byte indexY = 0; indexY < 9; indexY++) {
                currChar = board[indexY][index];
                if (currChar == '.') {
                    continue;
                }
                if(!colSet.add(currChar)){
                    return false;
                }
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