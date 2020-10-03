package com.practice.ds.geeksforgeeks.graph.misc;

import java.util.Arrays;

// https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/
// https://www.youtube.com/watch?v=0DeznFqrgAI
public class NQueens {
    public static void main(String[] args) {
        int board[][] = {{0, 0, 0, 0},
                         {0, 0, 0, 0},
                         {0, 0, 0, 0},
                         {0, 0, 0, 0}};

        placeQueens(board, 0);
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }

    private static boolean placeQueens(int[][] board, int column) {
        if(column >= board.length)
            return true;

        for(int i = 0; i < board.length; i++) {
            if(isSafe(board, i, column)) {
                board[i][column] = 1;
                boolean queenPlaced = placeQueens(board, column + 1);
                if(queenPlaced) {
                    return true;
                } else {
                    board[i][column] = 0;
                    //return false;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1) return false;
        }
        return true;
    }
}
