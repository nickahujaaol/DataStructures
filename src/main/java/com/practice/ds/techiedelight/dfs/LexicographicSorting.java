package com.practice.ds.techiedelight.dfs;

import com.learning.ds.TrieNode;

import java.util.Arrays;
import java.util.List;

// https://www.techiedelight.com/lexicographic-sorting-given-set-of-keys/
// JUST READ THE EXPLANATION. REMEMBER HERE THAT YOU ARE STORING CHARACTERS IN AN ARRAY AND NOT IN MAP
// AND YOU ITERATE ON CHARACTER SEQUENCE AND HENCE WORDS WILL BE SORTED.
public class LexicographicSorting {
    public static void main(String[] args) {
        // given set of keys
        List<String> dict = Arrays.asList(
                "lexicographic", "sorting", "of", "a", "set", "of", "keys", "can", "be",
                "accomplished", "with", "a", "simple", "trie", "based", "algorithm",
                "we", "insert", "all", "keys", "in", "a", "trie", "output", "all",
                "keys", "in", "the", "trie", "by", "means", "of", "preorder",
                "traversal", "which", "results", "in", "output", "that", "is", "in",
                "lexicographically", "increasing", "order", "preorder", "traversal",
                "is", "a", "kind", "of", "depth", "first", "traversal"
        );

        TrieNode head = new TrieNode();

        // insert all keys of dictionary into trie
        for (String word: dict) {
            insert(head, word);
        }
    }

    private static void traversePreOrder(TrieNode node) {

    }


    public static void insert(TrieNode node, String key) {

    }
}
