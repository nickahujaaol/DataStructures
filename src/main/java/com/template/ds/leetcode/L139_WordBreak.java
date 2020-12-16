package com.template.ds.leetcode;

import com.learning.ds.TrieNode;

public class L139_WordBreak {
    public static void main(String[] args) {
        String inputString = "catsanddogs";
        String[] dictionary = {"cats", "dog", "sand", "and", "cat"};
        boolean allWordsFound = wordBreak(inputString, dictionary);
        System.out.println(allWordsFound);
    }

    private static boolean wordBreak(String inputString, String[] dictionary) {
        TrieNode rootNode = new TrieNode();
        for(String element : dictionary) {
            rootNode.insert(rootNode, element);
        }

        char[] inChars = inputString.toCharArray();
        TrieNode tempNode = rootNode;
        for(char inChar : inChars) {
            tempNode = tempNode.charToNodeMap.get(inChar);
            if(tempNode == null) {
                return false;
            } else if(tempNode.isLeaf) {
                tempNode = rootNode;
            }
        }

        if(tempNode != rootNode)
            return false;
        return true;
    }
}
