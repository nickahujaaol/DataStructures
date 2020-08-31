package com.practice.ds.techiedelight.dfs;


import java.util.LinkedList;

// https://www.techiedelight.com/find-occurrences-given-string-character-matrix/
public class FindAllOccurancesOfGivenString {
    private static final int[] xCoord = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] yCoord = {-1, 0, 1, -1, 1, -1, 0, 1};

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
        LinkedList<Node> path = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == searchWord.charAt(0)) {
                    path.add(new Node(searchWord.charAt(0), i, j));
                    search(matrix, searchWord, i, j, path, 0);
                }
            }
        }
    }

    private static void search(char[][] matrix, String searchWord, int row, int column, LinkedList<Node> path, int index) {
        if (index == searchWord.length() - 1) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < xCoord.length; i++) {
            if (isValid(matrix, row + xCoord[i], column + yCoord[i])) {
                char nextChar = searchWord.charAt(index + 1);
                if (matrix[row + xCoord[i]][column + yCoord[i]] == nextChar) {
                    path.add(new Node(nextChar, row + xCoord[i], column + yCoord[i]));
                    search(matrix, searchWord,
                            row + xCoord[i], column + yCoord[i],
                            path, index + 1);

                    path.removeLast();
                }
            }
        }
    }

    private static boolean isValid(char[][] matrix, int row, int column) {
        if (row >= 0 && row < matrix.length &&
                column >= 0 && column < matrix.length) {
            return true;
        } else {
            return false;
        }
    }

    private static class Node {
        public char c;
        public int x, y;

        public Node(char c, int x, int y) {
            this.c = c;
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + c + ", " + x + ", " + y + ")";
        }
    }
}
