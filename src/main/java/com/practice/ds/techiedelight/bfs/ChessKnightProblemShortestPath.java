package com.practice.ds.techiedelight.bfs;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/chess-knight-problem-find-shortest-path-source-destination/
public class ChessKnightProblemShortestPath {
    private static int[] row = {2, 2, -2, -2, 1, 1, -1, -1};
    private static int[] col = {-1, 1, 1, -1, 2, -2, 2, -2};

    // Check if (x, y) is valid chess board coordinates
    // Note that a knight cannot go out of the chessboard
    private static boolean isValid(int x, int y, boolean[][] visited) {
        if(x >= 0 && x < 8 &&
        y >= 0 && y < 8 &&
        !visited[x][y])
            return true;
        return false;
    }

    public static void main(String[] args) {
        boolean visited[][] = new boolean[8][8];
        Node startNode = new Node(0, 0);
        Node endNode = new Node(7, 0);
        findPath(startNode, endNode, visited);
    }

    private static void findPath(Node startNode, Node endNode, boolean[][] visited) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(startNode.x, startNode.y, 0));
        int minDistance = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            if(tempNode.x == endNode.x && tempNode.y == endNode.y) {
                minDistance = Math.min(minDistance, tempNode.dist);
            }
            visited[tempNode.x][tempNode.y] = true;
            for(int i = 0; i < row.length; i++) {
                if(isValid(tempNode.x + row[i], tempNode.y + col[i], visited)) {
                    queue.add(new Node(tempNode.x + row[i], tempNode.y + col[i], tempNode.dist + 1));
                }
            }
        }

        System.out.println("Min: " + minDistance);
    }

    private static class Node {
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
