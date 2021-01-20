package com.learning.ds.educative.patterns.mergeintervals_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P1_MergeIntervals {
    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1,4));
        list.add(new Interval(2,5));
        list.add(new Interval(7,9));

        merge(list);
    }

    private static void merge(List<Interval> intervalsList) {
        Stack<Interval> stack = new Stack();
        for(int i = 0; i < intervalsList.size(); i++) {
            if(!stack.isEmpty()) {
                Interval tempInterval = intervalsList.get(i);
                Interval poppedInterval = stack.pop();
                if( tempInterval.start >= poppedInterval.start &&
                        tempInterval.start <= poppedInterval.end) {
                    stack.push(new Interval(poppedInterval.start, tempInterval.end));
                } else {
                    stack.push(poppedInterval);
                    stack.push(tempInterval);
                }
            } else {
                stack.push(intervalsList.get(i));
            }
        }
        System.out.println(stack);
    }
}
