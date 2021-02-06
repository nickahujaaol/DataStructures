package com.learning.ds.techiedelight.bfs;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/lee-algorithm-shortest-path-in-a-maze/
// Check LeastCostSourceToDestination also. Same concept
public class ShortestPathInAMaze {
    // Below arrays details all 4 possible movements from a cell
    private static final int[] row = {-1, 0, 0, 1};
    private static final int[] col = {0, -1, 1, 0};

    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
                        {0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
                        {0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
                        {1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
                        {0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
                        {0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                        {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
                        {0, 0, 1, 0, 0, 1, 1, 0, 0, 1},
                };
        boolean[][] visited = new boolean[10][10];
        findShortestPath(matrix, 0, 0, 7, 5, visited);
    }

    private static void findShortestPath(int[][] matrix, int startX, int startY, int endX, int endY, boolean[][] visited) {
        int minDistance = Integer.MAX_VALUE;
        Node node = new Node(startX, startY, 0);
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node removedNode = queue.remove();
            visited[removedNode.x][removedNode.y] = true;

            if (removedNode.x == endX && removedNode.y == endY) {
                minDistance = Math.min(minDistance, removedNode.distance);
                break;
            }

            for (int i = 0; i < row.length; i++) {
                if (isValid(matrix, removedNode.x + row[i], removedNode.y + col[i], visited)) {
                    queue.add(new Node(removedNode.x + row[i],
                            removedNode.y + col[i],
                            removedNode.distance + 1));
                }
            }
        }
        System.out.println("Min Distance: " + minDistance);
    }

    private static boolean isValid(int[][] matrix, int x, int y, boolean[][] visited) {
        if (x >= 0 && x < matrix.length &&
                y > 0 && y < matrix[0].length &&
                matrix[x][y] == 1 && !visited[x][y]) {
            return true;
        } else {
            return false;
        }
    }

    public static class Node {
        public int x;
        public int y;
        public int distance;

        public Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}
