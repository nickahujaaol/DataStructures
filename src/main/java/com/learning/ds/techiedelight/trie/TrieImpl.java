package com.learning.ds.techiedelight.trie;

import com.learning.ds.TrieNode;

// https://www.techiedelight.com/implement-trie-data-structure-java/
public class TrieImpl {
    static TrieNode node = new TrieNode();

    private static void insert(String key) {
        if(node == null) {
            return;
        }

        TrieNode tempNode = node;
        for(int i = 0; i < key.length(); i++) {
            tempNode.charToNodeMap.putIfAbsent(key.charAt(i), new TrieNode());
            tempNode = tempNode.charToNodeMap.get(key.charAt(i));
        }
        tempNode.isLeaf = true;
    }

    private static boolean search(String key) {
        if(key == null)
            return false;

        TrieNode tempNode = node;
        for(int i = 0; i < key.length(); i++) {
            tempNode = tempNode.charToNodeMap.get(key.charAt(i));
            if(tempNode == null)
                return false;
        }

        return tempNode.isLeaf;
    }

    public static void main(String[] args) {
        insert("techie");
        insert("techi");
        insert("tech");

        System.out.println(search("tech"));			// true
        System.out.println(search("techi"));   		// true
        System.out.println(search("techie"));  		// true
        System.out.println(search("techiedelight"));   // false

        insert("techiedelight");

        System.out.println(search("tec"));			// true
        System.out.println(search("techi"));   		// true
        System.out.println(search("techie"));  		// true
        System.out.println(search("techiedelight"));   // true
    }
}
