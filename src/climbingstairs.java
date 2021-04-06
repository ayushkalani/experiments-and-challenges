package com.ayush;

public class climbingstairs {
    private static Integer[] cache = new Integer[46];

    public static int climbStairs(int N) {
        cache[1]=1;
        cache[2]=2;
        if(cache[N] == null) cache[N] = climbStairs(N-1) + climbStairs(N-2);
        return cache[N];

    }

    public static void main(String[] args) {
        System.out.print(climbStairs(2));
    }
}
