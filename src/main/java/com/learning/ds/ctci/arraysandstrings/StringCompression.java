package com.learning.ds.ctci.arraysandstrings;

public class StringCompression {
    public static void main(String[] args) {
        // a2b1c5a3
        String inStr = "aabcccccaaa";
        String compressedString = compress(inStr);
        System.out.println(compressedString);
    }

    private static String compress(String inString) {
        int index = 1;
        if(inString.length() == 1)
            return inString+inString;
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i < inString. length(); i++) {
            if(inString.charAt(i) == inString.charAt(i-1))
                index++;
            else {
                stringBuilder.append(inString.charAt(i-1)).append(index);
                index = 1;
            }
        }
        stringBuilder.append(inString.charAt(inString.length() - 1)).append(index);

        return stringBuilder.toString();
    }
}
