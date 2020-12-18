package com.practice.ds.leetcode;

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

        char startChar = number.charAt(0);
        for(int i = 0; i < number.length(); i++) {
            startChar = number.charAt(i);
            if(i < number.length() - 1 && number.charAt(i) == number.charAt(i + 1)) {
                frequency++;
            } else {
                result = result + frequency + startChar;
                frequency = 1;
            }
        }
        return result;
    }
}
