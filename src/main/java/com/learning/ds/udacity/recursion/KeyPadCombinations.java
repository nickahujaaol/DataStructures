package com.learning.ds.udacity.recursion;

import java.util.ArrayList;
import java.util.List;

/*
Keypad Combinations
A keypad on a cellphone has alphabets for all numbers between 2 and 9, as shown in the figure below:
You can make different combinations of alphabets by pressing the numbers.

For example, if you press 23, the following combinations are possible:

ad, ae, af, bd, be, bf, cd, ce, cf

Note that because 2 is pressed before 3, the first letter is always an alphabet on the number 2. Likewise, if the user types 32, the order would be

da, db, dc, ea, eb, ec, fa, fb, fc

Given an integer num, find out all the possible strings that can be made using digits of input num.
Return these strings in a list. The order of strings in the list does not matter.
However, as stated earlier, the order of letters in a particular string matters.
 */
public class KeyPadCombinations {
    public static void main(String[] args) {
        List<String> results = new ArrayList<>();
        char[] inNumber = "234".toCharArray();
        char[] tempArray = new char[inNumber.length];
        findCombinations(inNumber, 0, tempArray, results);
        System.out.println(results);
    }

    private static void findCombinations(char inNumber[], int index, char[] tempArray, List<String> results) {
        if (index >= inNumber.length) {
            results.add(new String(tempArray));
        } else {
            int indexNum = Integer.parseInt("" + inNumber[index]);
            String indexChars = getCharacters(indexNum);
            char[] indexCharArray = indexChars.toCharArray();
            for (int i = 0; i < indexChars.length(); i++) {
                tempArray[index] = indexCharArray[i];
                findCombinations(inNumber, index + 1, tempArray, results);
            }
        }
    }

    private static String getCharacters(int number) {
        switch (number) {
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
            default:
                return "";
        }
    }
}
