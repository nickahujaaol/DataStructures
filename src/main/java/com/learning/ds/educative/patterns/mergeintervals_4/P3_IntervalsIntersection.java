package com.learning.ds.educative.patterns.mergeintervals_4;

import java.util.ArrayList;
import java.util.List;

public class P3_IntervalsIntersection {
    public static void main(String[] args) {
        List<Interval> list1 = new ArrayList<>();
//        list1.add(new Interval(1,3));
//        list1.add(new Interval(5,6));
//        list1.add(new Interval(7,9));
//
//        List<Interval> list2 = new ArrayList<>();
//        list2.add(new Interval(2,3));
//        list2.add(new Interval(5,7));

        list1.add(new Interval(1,3));
        list1.add(new Interval(5,7));
        list1.add(new Interval(9,12));

        List<Interval> list2 = new ArrayList<>();
        list2.add(new Interval(5,10));

        List<Interval> intersectionList = findIntersection(list1, list2);
        System.out.println(intersectionList);
    }

    private static List<Interval> findIntersection(List<Interval> list1, List<Interval> list2) {
        int list1Counter = 0;
        int list2Counter = 0;
        List<Interval> mergedList = new ArrayList<>();

        while (list1Counter < list1.size() && list2Counter < list2.size()) {
            Interval tempInterval1 = list1.get(list1Counter);
            Interval tempInterval2 = list2.get(list2Counter);

            if((tempInterval2.start >= tempInterval1.start && tempInterval2.start <= tempInterval1.end) ||
                    (tempInterval2.end >= tempInterval1.start && tempInterval2.end <= tempInterval1.end)) {
                mergedList.add(new Interval(Math.max(tempInterval1.start, tempInterval2.start),
                        Math.min(tempInterval1.end, tempInterval2.end)));

            }

            if(tempInterval2.end <= tempInterval1.end)
                list2Counter++;

            if(tempInterval1.end <= tempInterval2.end)
                list1Counter++;
        }

        return mergedList;
    }
}
