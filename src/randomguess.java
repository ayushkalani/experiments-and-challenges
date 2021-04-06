package com.ayush;

import java.util.HashMap;

public class randomguess {

    public static int matches(String a, String b) {
        int matches = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) matches++;
        }
        return matches;
    }

    public static void main(String[] args) {
        //System.out.println(matches("aaaaaa", "avvaza"));
        int[] nums = {4, 1, 2, 1, 2};
        HashMap<Integer, Integer> poda = new HashMap<Integer, Integer>();

        for (int i : nums) {
            if (poda.containsKey(i)) {
                poda.put(i, poda.get(i) + 1);
            } else {
                poda.put(i, 1);
            }
        }

        for(int i : poda.values()) System.out.print(i);
    }
}
