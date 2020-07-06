package com.practice.ds.techiedelight.bfs;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/lee-algorithm-shortest-path-in-a-maze/
// Check LeastCostSourceToDestination also. Same concept
public class ShortestPathInAMaze {
    // Below arrays details all 4 possible movements from a cell
    private static final int[] row = { -1, 0, 0, 1 };
    private static final int[] col = { 0, -1, 1, 0 };

    public static void main(String[] args) {
        int[][] matrix =
                {
                        { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                        { 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
                        { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
                        { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
                        { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                        { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
                        { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                        { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
                };
        boolean[][] visited = new boolean[10][10];
        findShortestPath(matrix, 0,0, 7, 5, visited);
    }

    private static void findShortestPath(int[][] matrix, int startX, int startY, int endX, int endY, boolean[][] visited) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(startX, startY, 0));
        int minDistance = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            visited[tempNode.x][tempNode.y] = true;

            if(tempNode.x == endX && tempNode.y == endY) {
                minDistance = Math.min(minDistance, tempNode.distance);
            }

            for(int i = 0; i < row.length; i++) {
                if(isValid(matrix, tempNode.x + row[i], tempNode.y + col[i], visited)) {
                    queue.add(new Node(tempNode.x + row[i],
                            tempNode.y + col[i],
                            tempNode.distance + 1));
                }
            }
        }

        System.out.println("Min distance is: " + minDistance);
    }

    private static boolean isValid(int[][] matrix, int x, int y, boolean[][] visited) {
        if(x >= 0 && x < matrix.length &&
        y >= 0 && y < matrix.length &&
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
