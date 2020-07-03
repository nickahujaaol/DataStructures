package com.practice.ds.techiedelight.bfs;

// https://www.techiedelight.com/chess-knight-problem-find-shortest-path-source-destination/
public class ChessKnightProblemShortestPath {
    private static int[] row = { 2, 2, -2, -2, 1, 1, -1, -1 };
    private static int[] col = { -1, 1, 1, -1, 2, -2, 2, -2 };

    // Check if (x, y) is valid chess board coordinates
    // Note that a knight cannot go out of the chessboard
    private static boolean isValid(int x, int y, boolean[][] visited) {
        return false;
    }

    public static void main(String[] args) {
        boolean visited[][] = new boolean[8][8];
        Node startNode = new Node(0,0);
        Node endNode = new Node(7,0);
        findPath(startNode, endNode, visited);
    }

    private static void findPath(Node startNode, Node endNode, boolean[][] visited) {

    }

    private static class Node{
        public int x, y, dist;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}
