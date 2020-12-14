package com.finalprep.dfs;


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
    }

    private static boolean isValid(char[][] matrix, int row, int column) {
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
