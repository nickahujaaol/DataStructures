package com.learning.ds.techiedelight.dfs;


import java.util.LinkedList;

// https://www.techiedelight.com/find-occurrences-given-string-character-matrix/
public class FindAllOccurancesOfGivenString {
    public static void main(String[] args) {
        char matrix[][] =
                {
                        "DEMXB".toCharArray(),
                        "AOEPE".toCharArray(),
                        "DDCOD".toCharArray(),
                        "EBEDS".toCharArray(),
                        "CPYEN".toCharArray()
                };
        String searchWord = "CODE";
        findWords(matrix, searchWord);
    }

    private static void findWords(char[][] matrix, String searchWord) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == searchWord.charAt(0)) {
                    search(matrix, searchWord, i, j, new LinkedList<Node>(), 0);
                }
            }
        }
    }

    private static void search(char[][] matrix, String searchWord, int row, int column, LinkedList<Node> path, int index) {
        if(searchWord.charAt(index) != matrix[row][column]) {
            return;
        }
        path.add(new Node(row, column));
        if(index == searchWord.length() - 1) {
            System.out.println(path);
            path.remove(path.size() - 1);
            return;
        }

        if(isValid(matrix, row - 1, column - 1))
            search(matrix, searchWord, row - 1, column - 1, path, index + 1);
        if(isValid(matrix, row - 1, column))
            search(matrix, searchWord, row - 1, column, path, index + 1);
        if(isValid(matrix, row - 1, column + 1))
            search(matrix, searchWord, row - 1, column + 1, path, index + 1);
        if(isValid(matrix, row, column - 1))
            search(matrix, searchWord, row, column - 1, path, index + 1);
        if(isValid(matrix, row, column + 1))
            search(matrix, searchWord, row, column + 1, path, index + 1);
        if(isValid(matrix, row + 1, column - 1))
            search(matrix, searchWord, row + 1, column - 1, path, index + 1);
        if(isValid(matrix, row + 1, column))
            search(matrix, searchWord, row + 1, column, path, index + 1);
        if(isValid(matrix, row + 1, column + 1))
            search(matrix, searchWord, row + 1, column + 1, path, index + 1);

        path.remove(path.size() - 1);
    }

    private static boolean isValid(char[][] matrix, int row, int column) {
        if(row >=0 && row < matrix.length &&
        column >= 0 && column < matrix[0].length) {
            return true;
        } else {
            return false;
        }
    }

    private static class Node {
        public int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}
