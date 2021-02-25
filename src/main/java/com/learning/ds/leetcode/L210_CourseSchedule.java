package com.learning.ds.leetcode;

import com.learning.ds.Graph;

import java.util.LinkedList;
import java.util.Stack;

public class L210_CourseSchedule {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[4];
        Graph graph = createGraph();
        for(int i = 0; i < 4; i++) {
            findOrder(i, graph, visited, stack);
        }

        System.out.println(stack);
    }

    private static void findOrder(int nodeIndex, Graph graph, boolean[] visited, Stack<Integer> stack) {
        visited[nodeIndex] = true;
        LinkedList<Integer> neighbors = graph.adjacencyList[nodeIndex];
        for(int i = 0; i < neighbors.size(); i++) {
            if(!visited[neighbors.get(i)]) {
                findOrder(neighbors.get(i), graph, visited, stack);
            }
        }
        stack.push(nodeIndex);
    }

    private static Graph createGraph() {
        Graph graph = new Graph(4);
        graph.addEdge(2,0);
        graph.addEdge(1,0);
        graph.addEdge(3,2);
        graph.addEdge(3,1);

        return graph;
    }
}
