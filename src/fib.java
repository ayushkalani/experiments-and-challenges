package com.ayush;

import java.util.HashMap;

public class fib {
    private static Integer[] cache = new Integer[31];

    public static int fib(int N) {
        if (cache[N] == null) cache[N] = fib(N - 1) + fib(N - 2);
        return cache[N];
    }


    public static void main(String[] args) {
        cache[0] = 0;
        cache[1] = 1;
        System.out.println(fib(4));
    }
}
