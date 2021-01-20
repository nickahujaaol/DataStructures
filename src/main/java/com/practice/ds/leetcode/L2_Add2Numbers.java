package com.practice.ds.leetcode;

import java.util.LinkedList;
import java.util.List;

public class L2_Add2Numbers {
    public static void main(String[] args) {
        List<Integer> number1 = new LinkedList<>();
        List<Integer> number2 = new LinkedList<>();

        number1.add(2);
        number1.add(4);
        number1.add(3);

        number2.add(5);
        number2.add(6);
        number2.add(4);

        List<Integer> retList = add(number1, number2);
        System.out.println(retList);
    }

    private static List<Integer> add(List<Integer> number1, List<Integer> number2) {
        List<Integer> retList = new LinkedList<>();
        int carryOver = 0;

        for(int i = 0; i < number1.size(); i++) {
            int tempSum = number1.get(i) + number2.get(i) + carryOver;
            retList.add(tempSum % 10);
            carryOver = tempSum / 10;
        }

        if(carryOver > 0) {
            retList.add(carryOver);
        }
        return retList;
    }
}
