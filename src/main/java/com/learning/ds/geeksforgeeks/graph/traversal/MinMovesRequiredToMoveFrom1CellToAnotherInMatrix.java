package com.learning.ds.geeksforgeeks.graph.traversal;

import java.util.LinkedList;
import java.util.Queue;

// https://www.geeksforgeeks.org/find-minimum-numbers-moves-needed-move-one-cell-matrix-another/
public class MinMovesRequiredToMoveFrom1CellToAnotherInMatrix {

    public static void main(String[] args) {
        int matrix[][] = {
                            {3, 3, 1, 0},
                            {3, 0, 3, 3},
                            {2, 3, 0, 3},
                            {0, 3, 3, 3}
        };
        boolean[][] visited = new boolean[4][4];
        findMinPath(matrix, 0, 2, visited);
    }

    private static void findMinPath(int[][] matrix, int startX, int startY, boolean[][] visited) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(startX, startY, 0));
        int minDistance = Integer.MAX_VALUE;

        int[] row = {0, -1, 0, 1};
        int[] col = {1, 0, -1, 0};

        while (!queue.isEmpty()) {
            Node removedNode = queue.poll();
            visited[removedNode.x][removedNode.y] = true;

            if (matrix[removedNode.x][removedNode.y] == 2) {
                minDistance = Math.min(minDistance, removedNode.dist);
            }

            for (int i = 0; i < row.length; i++) {
                if (isValid(matrix, removedNode.x + row[i], removedNode.y + col[i], visited)) {
                    queue.add(new Node(removedNode.x + row[i],
                            removedNode.y + col[i],
                            removedNode.dist + 1));
                }
            }
        }

        System.out.println("Min Distance is: " + minDistance);
    }

    public static boolean isValid(int[][] matrix, int x, int y, boolean[][] visited) {
        if (x >= 0 && x < matrix.length &&
                y >= 0 && y < matrix.length &&
                matrix[x][y] != 0 && !visited[x][y]) {
            return true;
        } else {
            return false;
        }
    }

    private static class Node {
        public int x, y, dist;

        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}
