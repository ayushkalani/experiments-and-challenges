package com.ayush;

import java.util.Arrays;
import java.util.HashMap;

public class test {

    public static boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < order.length(); i++)  hm.put(order.charAt(i), i);
        search: for(int i = 0; i<words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i+1];
            for(int j = 0; j < Math.min(s1.length(),s2.length()); j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    if (hm.get(s1.charAt(j)) > hm.get(s2.charAt(j))){
                        return false;
                    }
                   continue search;
                }
            }
            if(s1.length() > s2.length()) return false;

        }
        return true;
    }


    public static void main (String[] args){
       String[] words = new String[]{"apple","app"};
       //System.out.println(isAlienSorted(words, "hlabcdefgijkmnopqrstuvwxyz"));

        Float[] cpuUsage = {null, null, null, null, null};
        System.out.println(cpuUsage.length);


    }
}