package com.practice.ds.techiedelight.bfs;

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

    }

    private static boolean isValid(int[][] matrix, int x, int y, boolean[][] visited) {
        return false;
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
