package com.template.ds.geeksforgeeks.graph.misc;

// https://www.geeksforgeeks.org/snake-ladder-problem-2/
// https://www.techiedelight.com/min-throws-required-to-win-snake-and-ladder-game/
public class SnakeAndLadder {
    public static void main(String[] args) {
        int numOfVertices = 30;
        int moves[] = new int[numOfVertices];
        for (int i = 0; i < numOfVertices; i++)
            moves[i] = -1;

        // Ladders
        moves[2] = 21;
        moves[4] = 7;
        moves[10] = 25;
        moves[19] = 28;

        // Snakes
        moves[26] = 0;
        moves[20] = 8;
        moves[16] = 3;
        moves[18] = 6;

        findMinNumberOfMoves(moves);
    }

    private static void findMinNumberOfMoves(int[] moves) {

    }

    private static class QueueEntry {
        int vertex;
        int distance;
        public QueueEntry() {

        }
        public QueueEntry(int vertex, int distance) {
            this.distance = distance;
            this.vertex = vertex;
        }
    }
}
