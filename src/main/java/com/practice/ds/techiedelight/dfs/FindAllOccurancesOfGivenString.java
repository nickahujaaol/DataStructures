package com.practice.ds.techiedelight.dfs;


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

    }

    private static void search(char[][] matrix, String searchWord, int row, int column, LinkedList<Node> path, int index) {

    }

    private static boolean isValid(char[][] matrix, int row, int column) {
        return false;
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
