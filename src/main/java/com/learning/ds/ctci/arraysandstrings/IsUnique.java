package com.learning.ds.ctci.arraysandstrings;

// You cal also do O(n2)
// You can also sort, O(n Log n)
public class IsUnique {
    public static void main(String[] args) {
        String inString = "abcdefga";
        boolean isUnique = isUnique(inString);
        System.out.println("Is Unique: " + isUnique);
    }

    private static boolean isUnique(String inString) {
        boolean[] charSet = new boolean[128];
        if(inString.length() > 129)
            return false;
        for(int i = 0; i < inString.length(); i++) {
            if(charSet[inString.charAt(i)])
                return false;
            else
                charSet[inString.charAt(i)] = true;
        }
        return true;
    }
}
