package com.ayush;

public class reversestring {

    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int l = arr.length;
        String ans = "";
        for(int i = l-1; i>=0; i--) {
            ans = ans.concat(arr[i]).concat(" ");
        }
        return ans.trim();
    }

    public static void main (String[] args){
        System.out.println(reverseWords("  Bob    Loves  Alice   "));
    }
}
