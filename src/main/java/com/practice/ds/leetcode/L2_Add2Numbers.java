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

        number2.add(9);
        number2.add(9);
        number2.add(9);

        List<Integer> retList = add(number1, number2);
        System.out.println(retList);
    }

    private static List<Integer> add(List<Integer> number1, List<Integer> number2) {
        List<Integer> retList = new LinkedList<>();

        int carryOver = 0;
        int index = 0;
        for(index = 0; index < number1.size(); index++) {
            int num1 = number1.get(index);
            int num2 = number2.get(index);
            int addedNum = num1 + num2 + carryOver;
            retList.add(addedNum % 10);
            carryOver = addedNum / 10;
        }
        if(carryOver > 0)
            retList.add(carryOver);

        return retList;
    }
}
