package com.ayush;

import java.util.HashMap;
import java.util.Map;

public class uniquepaths {

    public static void main(String[] args) {
        HashMap<Integer, String> poda = new HashMap<>();
        String text = "  this   is  a sentence ";
        poda.put(text.hashCode(), text);

        int spaces = text.chars().map(c -> c == ' ' ? 1 : 0).sum();
        String[] kol = text.trim().split("\\s+");
        int l = kol.length;
        int r = (spaces % (l - 1));
        int k = (spaces / (l - 1));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (l > 0) {
            sb.append(kol[i++]);
            if( l != 1) { for (int q = 0; q < k; q++) sb.append(" ");}

            l--;
        }
        if (r != 0) for (int p = 0; p < r; p++) sb.append(" ");
        System.out.print(sb);

    }
}
