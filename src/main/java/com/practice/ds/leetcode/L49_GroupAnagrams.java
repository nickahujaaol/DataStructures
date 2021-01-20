package com.practice.ds.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class L49_GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, ArrayList<String>> groupsMap = new HashMap<>();
        findGroups(strs, groupsMap);
        System.out.println(groupsMap.values());
    }

    private static void findGroups(String[] strs, HashMap<String, ArrayList<String>> groupsMap) {

    }
}
