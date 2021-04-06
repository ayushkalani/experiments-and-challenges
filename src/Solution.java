package com.ayush;

import java.util.HashSet;

class Solution {
    public static String reverseVowels(String s) {
        HashSet<Character> v = new HashSet<Character>();
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');

        int l = s.length();
        int i = 0;
        int j = l - 1;
        char[] poda = s.toCharArray();

        while(i<j) {
            if(v.contains(poda[i])) {
                if(v.contains(poda[j])) {
                    char temp = poda[i];
                    poda[i] = poda[j];
                    poda[j] = temp;
                    i++;
                    j--;
                }
                else {
                    j--;
                }
            }

        }
        return String.valueOf(poda);
    }

    public static void main (String[] args){
        reverseVowels("hello");

    }
}