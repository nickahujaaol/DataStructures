package com.practice.ds.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L22_GenerateParentheses {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        generate(3, 3, "", result);
        System.out.println(result);
    }

    private static void generate(int openCounter, int closeCounter, String holderStr, List<String> result) {
        if(openCounter == 0 && closeCounter == 0) {
            result.add(holderStr);
            return;
        }

        if(openCounter > 0)
            generate(openCounter - 1, closeCounter, holderStr + "(", result);

        if(closeCounter > 0 && closeCounter > openCounter)
            generate(openCounter, closeCounter - 1, holderStr + ")", result);
    }
}
