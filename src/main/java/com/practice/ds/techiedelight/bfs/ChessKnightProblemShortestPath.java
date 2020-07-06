package com.practice.ds.techiedelight.bfs;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/chess-knight-problem-find-shortest-path-source-destination/
public class ChessKnightProblemShortestPath {
    private static int[] row = { 2, 2, -2, -2, 1, 1, -1, -1 };
    private static int[] col = { -1, 1, 1, -1, 2, -2, 2, -2 };


    public static void main(String[] args) {
        boolean visited[][] = new boolean[8][8];
        Node startNode = new Node(0,0);
        Node endNode = new Node(7,0);
        findPath(startNode, endNode, visited);
    }

    private static void findPath(Node startNode, Node endNode, boolean[][] visited) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(startNode.x, startNode.y));
        int minDistance = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Node removedNode = queue.poll();
            if(removedNode.x == endNode.x && removedNode.y == endNode.y) {
                minDistance = Math.min(minDistance, removedNode.dist);
            }

            for(int i = 0; i < row.length; i++) {
                if(isSafe(removedNode.x + row[i], removedNode.y + col[i], visited)) {
                    visited[removedNode.x][removedNode.y] = true;
                    queue.add(new Node(removedNode.x + row[i],
                            removedNode.y + col[i],
                            removedNode.dist + 1));
                }
            }
        }

        System.out.println("Min distance is: " + minDistance);
    }

    private static boolean isSafe(int x, int y, boolean[][] visited) {
        if(x >= 0 && x < visited.length &&
        y >= 0 && y < visited.length &&
        !visited[x][y]) {
            return true;
        } else {
            return false;
        }
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
