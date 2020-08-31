package com.learning.ds.geeksforgeeks.graph.misc;

import java.util.LinkedList;
import java.util.Queue;

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
        boolean visited[] = new boolean[moves.length];
        QueueEntry queueEntry = new QueueEntry(moves[0], 0);
        QueueEntry lastEntry = queueEntry;
        Queue<QueueEntry> queue = new LinkedList<>();
        queue.add(queueEntry);
        visited[0] = true;

        while (!queue.isEmpty()) {
            QueueEntry removedEntry = queue.remove();
            lastEntry = removedEntry;

            if (removedEntry.vertexNumber >= moves.length - 1) {
                break;
            }
            for (int i = removedEntry.vertexNumber + 1; i <= removedEntry.vertexNumber + 6 && i < moves.length; i++) {
                if (!visited[i]) {
                    QueueEntry newEntry = new QueueEntry();
                    newEntry.distance = removedEntry.distance + 1;
                    if (moves[i] != -1) {
                        newEntry.vertexNumber = moves[i];
                    } else {
                        newEntry.vertexNumber = i;
                    }
                    queue.add(newEntry);
                    visited[i] = true;
                }
            }
        }
        System.out.println("Number of moves required : " + lastEntry.distance);
    }

    private static class QueueEntry {
        int vertexNumber;
        int distance;

        public QueueEntry() {

        }

        public QueueEntry(int vertexNumber, int distance) {
            this.distance = distance;
            this.vertexNumber = vertexNumber;
        }
    }
}
