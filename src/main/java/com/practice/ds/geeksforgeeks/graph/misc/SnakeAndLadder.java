package com.practice.ds.geeksforgeeks.graph.misc;

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
        Queue<QueueEntry> queue = new LinkedList<>();
        queue.add(new QueueEntry(0,0));
        QueueEntry lastEntry = null;
        boolean[] visited = new boolean[moves.length];
        visited[0] = true;

        while (!queue.isEmpty()) {
            QueueEntry removedEntry = queue.poll();
            if(removedEntry.vertex >= moves.length - 1) {
                break;
            }

            for(int i = removedEntry.vertex; i <= removedEntry.vertex + 6 && i < moves.length; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    QueueEntry newEntry = null;
                    if (moves[i] != -1) {
                        newEntry = new QueueEntry(moves[i], removedEntry.distance + 1);
                    } else {
                        newEntry = new QueueEntry(i, removedEntry.distance + 1);
                    }
                    queue.add(newEntry);
                    lastEntry = newEntry;
                }
            }
        }

        System.out.println("Number of moved: " + lastEntry.distance);
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
