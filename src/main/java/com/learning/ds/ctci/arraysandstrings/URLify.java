package com.learning.ds.ctci.arraysandstrings;

public class URLify {
    public static void main(String[] args) {
        String inStr = "Mr John Lock";
        String outString = urlify(inStr);
        System.out.println(outString);
    }

    private static String urlify(String inStr) {
        int inLength = inStr.length();
        int numOfSpaces = 0;
        for(int i = 0; i < inStr.length(); i++) {
            if(inStr.charAt(i) == ' ')
                numOfSpaces++;
        }

        int index = inLength + numOfSpaces*2;
        char[] finalChars = new char[index];

        for(int i = inStr.length() - 1; i >= 0; i--) {
            if(inStr.charAt(i) == ' ') {
                finalChars[index-1] = '0';
                finalChars[index-2] = '2';
                finalChars[index-3] = '%';
                index -= 3;
            } else {
                finalChars[index - 1] = inStr.charAt(i);
                index--;
            }
        }
        return new String(finalChars);
    }
}
