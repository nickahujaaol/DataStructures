package com.learning.ds.leetcode;

import com.learning.ds.Graph;

import java.util.LinkedList;

public class L207_CourseSchedule {
    public static void main(String[] args) {
        Graph graph = createGraph();
        int numOfCourses = 3;
        boolean[] visited = new boolean[4];
        boolean canCompleteAllCourses = checkCoursePreRequisites(0, graph, visited);
        System.out.println(canCompleteAllCourses);
    }

    private static boolean checkCoursePreRequisites(int courseNum, Graph graph, boolean[] visited) {
        boolean canComplete = true;

        visited[courseNum] = true;
        LinkedList<Integer> neighbors = graph.adjacencyList[courseNum];
        for(int i = 0; i < neighbors.size(); i++) {
            if(visited[neighbors.get(i)]) {
                canComplete = false;
                break;
            }
            canComplete = checkCoursePreRequisites(neighbors.get(i), graph, visited);
        }

        return canComplete;
    }


    private static Graph createGraph() {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        return graph;
    }
}
