package com.learning.ds;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public boolean isLeaf;
    public int count;
    public Map<Character, TrieNode> charToNodeMap = new HashMap<>();

    public void insert(TrieNode node, String key) {
        for (int i = 0; i < key.length(); i++) {
            node.charToNodeMap.putIfAbsent(key.charAt(i), new TrieNode());
            node = node.charToNodeMap.get(key.charAt(i));
        }
        node.isLeaf = true;
        node.count++;
    }
}
