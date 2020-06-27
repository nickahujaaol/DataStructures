package com.learning.ds.techiedelight.bfs;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/lee-algorithm-shortest-path-in-a-maze/
// Check LeastCostSourceToDestination also. Same concept
public class ShortestPathInAMaze {
    public static void main(String[] args) {
        int[][] mattrix =
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
    }

    private static void findShortestPath(int[][] matrix) {
        int minDistance = Integer.MAX_VALUE;
        Node node = new Node(0,0,0);
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);


    }

    private static boolean isValid(int[][] matrix, int x, int y, boolean[][] visited) {
        if(x >=0 && x < matrix.length &&
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
