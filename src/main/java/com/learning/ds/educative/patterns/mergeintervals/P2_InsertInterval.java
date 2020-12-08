package com.learning.ds.educative.patterns.mergeintervals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P2_InsertInterval {
    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1,3));
        list.add(new Interval(5,7));
        list.add(new Interval(8,12));

        merge(list, new Interval(4,6));
    }

    private static void merge(List<Interval> intervalsList, Interval insertInterval) {
        Stack<Interval> stack = new Stack();
        for(int i = 0; i < intervalsList.size(); i++) {
            if(!stack.isEmpty()) {
                Interval tempInterval = intervalsList.get(i);

                if(insertInterval.start >= tempInterval.start && insertInterval.start <= tempInterval.end) {
                    stack.push(new Interval(tempInterval.start, insertInterval.end));
                } else if(insertInterval.end >= tempInterval.start && insertInterval.end <= tempInterval.end) {
                    stack.push(new Interval(insertInterval.start, tempInterval.end));
                } else {
                    stack.push(tempInterval);
                }

            } else {
                stack.push(intervalsList.get(i));
            }
        }
        System.out.println(stack);
    }
}
