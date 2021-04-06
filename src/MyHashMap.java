package com.ayush;

import java.util.Arrays;

public class MyHashMap {

    /**
     * Initialize your data structure here.
     */
    private int[] data;
    private final int KEY = 1000000;

    public MyHashMap() {
        data = new int[KEY];
        Arrays.fill(data, -1);
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        data[key % KEY] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        return data[key % KEY];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        data[key % KEY] = -1;

    }

    public static void main(String[] args) {
        MyHashMap obj = new MyHashMap();
        obj.put(1000000, 3);
        int param_2 = obj.get(0);
        System.out.print(param_2);
    }
}