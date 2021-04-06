package com.ayush;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class missingelementinsortedarray {

    public static int missingElement(int[] nums, int k) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int ans = 0, i = 0;
        while( k > 0 && i < nums.length - 1 ) {
            int d = (nums[i+1] - nums[i]) - 1;
            while (d > 0 && k > 0 ) {
                    ans = ++nums[i];
                    k--;
                    d--;

            }
            i++;
        }
        return ans;
    }

    public static void main (String[] args){
        int[] intArray = new int[]{ 1,2,4 };
        System.out.println(missingElement(intArray, 3));

    }
}

