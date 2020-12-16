package com.template.ds.leetcode;

public class L67_AddBinary {
    public static void main(String[] args) {
        String addedStr = addBinary("111", "11");
        System.out.println(addedStr);
    }

    private static String addBinary(String x, String y) {
        int carryOver = 0;
        StringBuilder retBuffer = new StringBuilder();
        StringBuilder xBuffer = new StringBuilder(x);
        StringBuilder yBuffer = new StringBuilder(y);
        xBuffer.reverse();
        yBuffer.reverse();
        int yCounter = 0;

        for(int i = 0; i < xBuffer.length(); i++) {
            int sum = 0;
            if(yCounter < yBuffer.length()) {

                if (xBuffer.charAt(i) == '1' && yBuffer.charAt(yCounter) == '1') {
                    sum = 2 + carryOver;
                } else if ((xBuffer.charAt(i) == '0' && yBuffer.charAt(yCounter) == '1') ||
                        xBuffer.charAt(i) == '1' && yBuffer.charAt(yCounter) == '0') {
                    sum = 1 + carryOver;
                }
                yCounter++;
            } else {
                if(xBuffer.charAt(i) == '1') {
                    sum = 1 + carryOver;
                }
            }

            retBuffer.append(sum % 2);
            carryOver = sum / 2;
        }

        if(carryOver > 0)
            retBuffer.append(carryOver);

        return retBuffer.reverse().toString();
    }
}
