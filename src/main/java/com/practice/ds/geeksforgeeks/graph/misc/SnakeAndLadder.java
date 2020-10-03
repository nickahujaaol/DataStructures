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
        queue.add(new QueueEntry(1, 0));
        boolean visited[] = new boolean[moves.length];
        visited[0] = true;

        while (!queue.isEmpty()) {
            QueueEntry tempEntry = queue.poll();
            if(tempEntry.vertex >= moves.length - 1) {
                System.out.println("Min moves required are: " + tempEntry.distance);
                break;
            }
            for(int i = 1; i <= 6; i++) {
                if (tempEntry.vertex + i < moves.length) {
                    //if(!visited[tempEntry.vertex + i]){
                        if (moves[tempEntry.vertex + i] != -1) {
                            queue.add(new QueueEntry(moves[tempEntry.vertex + i], tempEntry.distance + 1));
                        } else {
                            queue.add(new QueueEntry(tempEntry.vertex + i, tempEntry.distance + 1));
                        }
                        //visited[tempEntry.vertex + i] = true;
                   // }
                }
            }
        }
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
