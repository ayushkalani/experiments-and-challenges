package com.ayush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class positionofnewgroups {

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int N = s.length(), j = 0;
        for (int i = 0; i < N; i++) {
            if (i == N - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (i - j + 1 >= 3) ans.add(Arrays.asList(new Integer[]{j, i}));
                j = i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abcdddeeeeaabbbcd"));
    }
}
