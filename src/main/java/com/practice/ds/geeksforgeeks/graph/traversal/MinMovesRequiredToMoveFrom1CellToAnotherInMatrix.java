package com.practice.ds.geeksforgeeks.graph.traversal;

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
        int minDistance = findMinPath(matrix, 0, 2, visited);
        System.out.println("Min Distance is: " + minDistance);
    }

    private static int findMinPath(int matrix[][], int startX, int startY, boolean[][] visited) {
        int minDistance = Integer.MAX_VALUE;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(startX, startY, 0));

        int[] row = {0, -1, 0, 1};
        int[] col = {1, 0, -1, 0};

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            visited[tempNode.x][tempNode.y] = true;
            if(matrix[tempNode.x][tempNode.y] == 2) {
                minDistance = Math.min(minDistance, tempNode.dist);
            }

            for(int i = 0; i < row.length; i++) {
                if(isValid(tempNode.x + row[i], tempNode.y + col[i], matrix, visited)) {
                    queue.add(new Node(tempNode.x + row[i], tempNode.y + col[i], tempNode.dist + 1));
                }
            }
        }

        return minDistance;
    }

    private static boolean isValid(int x, int y, int matrix[][], boolean[][] visited) {
        if(x >= 0 && y >= 0 && x < matrix.length && y < matrix.length
                && !visited[x][y] && matrix[x][y] != 0) {
            return true;
        }
        return false;
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
