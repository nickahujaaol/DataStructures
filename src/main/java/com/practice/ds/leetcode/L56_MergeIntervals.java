package com.practice.ds.leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class L56_MergeIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> list = new ArrayList<>();
        list.add(new Interval(1,3));
        list.add(new Interval(2,6));
        list.add(new Interval(8,10));
        list.add(new Interval(15,18));

        merge(list);
    }

    private static void merge(ArrayList<Interval> origList) {

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
