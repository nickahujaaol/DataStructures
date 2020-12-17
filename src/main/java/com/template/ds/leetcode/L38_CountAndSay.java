package com.template.ds.leetcode;

public class L38_CountAndSay {
    public static void main(String[] args) {
        String results = countAndSay(4);
        System.out.println(results);
    }

    private static String countAndSay(int number) {
        String result = "1";
        for(int i = 0; i < number; i++) {
            result = justSay(result);
        }
        return result;
    }

    private static String justSay(String number) {
        int frequency = 1;
        String result = "";

        return result;
    }
}
