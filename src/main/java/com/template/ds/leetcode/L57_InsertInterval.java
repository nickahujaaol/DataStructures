package com.template.ds.leetcode;

import java.util.Stack;

public class L57_InsertInterval {
    public static void main(String[] args) {
        Stack<Interval> stack = new Stack<>();
        stack.push(new Interval(1,2));
        stack.push(new Interval(3,5));
        stack.push(new Interval(6,7));
        stack.push(new Interval(8,10));
        stack.push(new Interval(12,16));

        insert(stack, new Interval(4,8));
        System.out.println(stack);
    }

    private static void insert(Stack<Interval> stack, Interval insertInterval) {

    }

    private static class Interval {
        int x,y;
        public Interval(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString(){
            return "["+ x + ", " + y + "]";
        }
    }
}
