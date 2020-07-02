package com.learning.ds;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public boolean isLeaf;
    public int count;
    public Map<Character, TrieNode> charToNodeMap = new HashMap<>();
}
