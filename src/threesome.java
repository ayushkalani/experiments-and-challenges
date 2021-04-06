package com.ayush;

import java.util.*;

public class threesome {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) if (i == 0 || nums[i] != nums[i - 1]) twoSum(nums, i, res);
        return res;
    }

    public static void twoSum(int[] arr, int k, List<List<Integer>> res) {
        Set<Integer> set = new HashSet<>();
        int l = arr.length;
        for (int j = k + 1; j < l; j++) {
            int complement = - arr[k] - arr[j];
            if (set.contains(complement)) {
                res.add(Arrays.asList(arr[k], arr[j], complement));
                while (j + 1 < l && arr[j] == arr[j + 1]) j++;
            }
            set.add(arr[j]);
        }
    }


    public static void main(String[] args) {
        int lop[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(lop));
    }

}
