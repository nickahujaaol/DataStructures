package com.practice.ds.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L93_RestoreIPAddresses {
    public static void main(String[] args) {
        List<String> finalIpAddresses = new ArrayList<>();
        restore("25425511135", 0, new ArrayList<String>(), finalIpAddresses);
        System.out.println(finalIpAddresses);
    }

    private static void restore(String inAddresses, int index, List<String> workingIp, List<String> finalIpAddresses) {
        if(index > inAddresses.length())
            return;

        if(workingIp.size() == 4 && ipSize(workingIp) == inAddresses.length())
            finalIpAddresses.add(getIp(workingIp));

        for(int i = index + 1; i <= (index + 3) && i <= inAddresses.length(); i++) {
            String ipPart = inAddresses.substring(index, i);
            int ipPartInt = Integer.parseInt(ipPart);
            if(ipPartInt >=0 && ipPartInt < 256) {
                workingIp.add(ipPart);
                restore(inAddresses, i, workingIp, finalIpAddresses);
                if(workingIp.size() > 0)
                    workingIp.remove(workingIp.size() - 1);
            }
        }


    }

    private static int ipSize(List<String> workingIp) {
        int size = 0;
        for(int i = 0; i < workingIp.size(); i++) {
            size += workingIp.get(i).length();
        }
        return size;
    }

    private static String getIp(List<String> workingIp) {
        StringBuilder builder = new StringBuilder();
        for(String ip : workingIp) {
            builder.append(ip).append(".");
        }
        return builder.toString();
    }

}
