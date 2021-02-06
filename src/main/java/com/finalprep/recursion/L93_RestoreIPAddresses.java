package com.finalprep.recursion;

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

        if(workingIp.size() > 4)
            return;

        if(workingIp.size() == 4) {
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < workingIp.size(); i++) {
                builder.append(workingIp.get(i));
            }

            if(builder.toString().length() == inAddresses.length())
                finalIpAddresses.add(workingIp.toString());
            return;
        }

        for(int i = index; i < index + 3; i++) {
            int ipPart = -1;
            if(i < inAddresses.length())
                ipPart = Integer.parseInt(inAddresses.substring(index, i + 1));
            if(ipPart >= 0 && ipPart < 256) {
                workingIp.add(""+ipPart);
                restore(inAddresses, i + 1, workingIp, finalIpAddresses);
                workingIp.remove(workingIp.size() - 1);
            }
        }
    }

}
