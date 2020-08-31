package com.learning.ds.techiedelight.dfs;

import com.learning.ds.TrieNode;

import java.util.ArrayList;
import java.util.Arrays;

// https://www.techiedelight.com/generate-list-of-possible-words-from-a-character-matrix/
// Just read
public class GenerateListOfPossibleWords {
    public static int[] xCoord = {-1, -1, -1, 0, 1, 0, 1, 1};
    public static int[] yCoord = {-1, 1, 0, -1, -1, 1, 0, 1};

    public static void main(String[] args) {
        char[][] matrix = {
                {'M', 'S', 'E', 'F'},
                {'R', 'A', 'T', 'D'},
                {'L', 'O', 'N', 'E'},
                {'K', 'A', 'F', 'B'}
        };

        TrieNode head = new TrieNode();
        String[] dictionary = {"START", "NOTE", "SAND", "STONED"};
        Arrays.stream(dictionary).forEach(word -> head.insert(head, word));

        search(matrix, head);
    }

    private static void search(char[][] matrix, TrieNode node) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (node.charToNodeMap.containsKey(matrix[i][j])) {
                    ArrayList<Character> word = new ArrayList<>();
                    word.add(matrix[i][j]);
                    search(matrix, i, j, node.charToNodeMap.get(matrix[i][j]), word);
                }
            }
        }
    }

    private static void search(char[][] matrix, int row, int col, TrieNode node, ArrayList<Character> word) {
        if (node.isLeaf) {
            System.out.println("Word Found: " + word.toString());
            return;
        }

        for (int i = 0; i < xCoord.length; i++) {
            int tempRow = row + xCoord[i];
            int tempCol = col + yCoord[i];
            if (isValid(matrix, tempRow, tempCol)) {
                if (node.charToNodeMap.containsKey(matrix[tempRow][tempCol])) {
                    word.add(matrix[tempRow][tempCol]);
                    TrieNode tempNode = node.charToNodeMap.get(matrix[tempRow][tempCol]);
                    search(matrix, tempRow, tempCol, tempNode, word);
                    word.remove(word.size() - 1);
                }
            }
        }
    }

    private static boolean isValid(char[][] matrix, int row, int col) {
        if (row >= 0 && row < matrix.length &&
                col >= 0 && col < matrix.length) {
            return true;
        } else {
            return false;
        }
    }
}
