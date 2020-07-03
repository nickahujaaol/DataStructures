package com.practice.ds.geeksforgeeks.graph.misc;

import java.util.Arrays;

// https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/
// https://www.youtube.com/watch?v=0DeznFqrgAI
public class NQueens {
    public static void main(String[] args) {
        int board[][] = { { 0, 0, 0, 0 },
                            { 0, 0, 0, 0 },
                            { 0, 0, 0, 0 },
                            { 0, 0, 0, 0 } };

        placeQueens(board, 0);
        for(int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }

    private static boolean placeQueens(int[][] board, int column) {

        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {

        return true;
    }
}
