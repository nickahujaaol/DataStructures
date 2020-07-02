package com.learning.ds.techiedelight.dfs;

import com.learning.ds.TrieNode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
        if(node == null) {
            return count;
        }
        for(Map.Entry entry : node.charToNodeMap.entrySet()) {
            Character character = (Character) entry.getKey();
            TrieNode trieNode = (TrieNode) entry.getValue();
            if(trieNode.isLeaf) {
                count = Math.max(count, trieNode.count);
            }
            count = traversePreOrder(trieNode, count);
        }
        return count;
    }

    public static void insert(TrieNode node, String key) {
        for(int i = 0; i < key.length(); i++) {
            node.charToNodeMap.putIfAbsent(key.charAt(i), new TrieNode());
            node = node.charToNodeMap.get(key.charAt(i));
        }
        node.isLeaf = true;
        node.count++;
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
