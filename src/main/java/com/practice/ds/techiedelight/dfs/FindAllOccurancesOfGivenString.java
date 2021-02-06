package com.practice.ds.techiedelight.dfs;


import java.util.LinkedList;

// https://www.techiedelight.com/find-occurrences-given-string-character-matrix/
public class FindAllOccurancesOfGivenString {
    static int rows[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int cols[] = {-1, 0, 1, -1, 1, -1, 0, 1};

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

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(searchWord.charAt(0) == matrix[i][j]) {
                    LinkedList<Node> path = new LinkedList<>();
                    path.add(new Node(searchWord.charAt(0), i, j));
                    findOccurrences(matrix, searchWord, 0, i, j, path);
                }
            }
        }
    }

    private static void findOccurrences(char[][] matrix, String searchWord, int searchIndex, int row, int col, LinkedList<Node> path) {
        if(searchIndex == searchWord.length() - 1) {
            System.out.println(path);
            return;
        }

        for(int i = 0; i < rows.length; i++) {
            if(isValid(matrix, row + rows[i], col + cols[i], searchWord, searchIndex + 1)) {
                path.add(new Node(matrix[row + rows[i]][col + cols[i]], row + rows[i], col + cols[i]));

                findOccurrences(matrix, searchWord, searchIndex + 1,
                        row + rows[i], col + cols[i],
                        path);
                path.removeLast();
            }
        }
    }

    private static boolean isValid(char[][] matrix, int row, int column, String searchWord, int searchIndex) {
        if(row >= 0 && row < matrix.length && column >= 0 && column < matrix.length &&
                searchIndex < searchWord.length() &&
        matrix[row][column] == searchWord.charAt(searchIndex)) {
            return true;
        }
        return false;
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
