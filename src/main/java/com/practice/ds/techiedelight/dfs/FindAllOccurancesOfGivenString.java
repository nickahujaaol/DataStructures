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
                    search(matrix, searchWord, i, j, new LinkedList<>(), 0);
                }
            }
        }
    }

    private static void search(char[][] matrix, String searchWord, int row, int column, LinkedList<Node> path, int index) {
        if(searchWord.charAt(index) != matrix[row][column])
            return;

        path.add(new Node(searchWord.charAt(index), row, column));
        if(index == searchWord.length() - 1) {
            System.out.println(path);
            path.removeLast();
            return;
        }

        for(int i = 0; i < rows.length; i++) {
            if(isValid(matrix, row + rows[i], column + cols[i])) {
                search(matrix, searchWord, row + rows[i], column + cols[i], path, index + 1);
            }
        }

        path.removeLast();
    }


    private static boolean isValid(char[][] matrix, int row, int column) {
        if(row >= 0 && row < matrix.length && column >= 0 && column < matrix.length) {
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
