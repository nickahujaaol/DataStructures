package com.practice.ds.techiedelight.dfs;

import com.learning.ds.TrieNode;

import java.util.Arrays;
import java.util.List;

// https://www.techiedelight.com/find-maximum-occurring-word-given-set-strings/
public class FindMaximumOccurringWord {
    String wordOccurringMax = "";

    public static void main(String[] args) {
        List<String> dict = Arrays.asList(
                "code", "coder", "coding", "codable", "codec", "codecs", "coded",
                "codeless", "codec", "codecs", "codependence", "codex", "codify",
                "codependents", "codes", "code", "coder", "codesign", "codec",
                "codeveloper", "codrive", "codec", "codecs", "codiscovered"
        );

        // Insert all keys into a trie
        TrieNode head = new TrieNode();
        for (String word : dict) {
            insert(head, word);
        }
        int maxCount = traversePreOrder(head, Integer.MIN_VALUE);
        System.out.println("Max occurrence is : " + maxCount);
    }
    private static int traversePreOrder(TrieNode node, int count) {
        return 0;
    }

    public static void insert(TrieNode node, String key) {

    }

    public static boolean search(TrieNode node, String searchKey) {
        for(int i = 0; i < searchKey.length(); i++) {
            node = node.charToNodeMap.get(searchKey.charAt(i));
            if(node == null)
                return false;
        }
        return node.isLeaf;
    }

}
