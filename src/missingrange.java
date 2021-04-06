package com.ayush;

import java.util.ArrayList;
import java.util.List;

public class missingrange {


    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ans = new ArrayList<>();
        int s = nums.length;
        if (lower < nums[0]) ans.add(getRange(lower, nums[0]));
//
//        for (int i = 0; i < s; i++) {
//           nums[i]
//        }
        if (nums[s] < upper) ans.add(getRange(nums[s], upper));
        return ans;

    }

    public static String getRange(int l, int h) {
        if (h - l == 2) {
            return String.valueOf(l + 1);
        } else if (h - l > 2) {
            return String.valueOf(l + 1) + "->" + String.valueOf(h - 1);
        }
        return "";
    }

    public static void main(String[] args) {

    }
}
