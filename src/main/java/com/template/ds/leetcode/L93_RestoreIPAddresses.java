package com.template.ds.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L93_RestoreIPAddresses {
    public static void main(String[] args) {
        List<String> finalIpAddresses = new ArrayList<>();
        restore("25425511135", 0, new ArrayList<String>(), finalIpAddresses);
        System.out.println(finalIpAddresses);
    }

    private static void restore(String inAddresses, int index, List<String> workingIp, List<String> finalIpAddresses) {

    }

}
