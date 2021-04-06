package com.ayush;

public class razorpay {

    public static int subArrayMinLen(int[] nums, int p) {
        int sum = 0, minlen = -1, currSum = 0;
        int left = 0, right = 0;
        for (int i : nums) sum += i;
        int target = sum % p;
        if (target == 0) {
            return 0;
        }
        // sliding window
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[right] == target) {
                return 1;
            } else if (nums[right + 1] + currSum == target) {
                minlen = Math.min(minlen, right - left + 1);
                left = right++ + 1;
            } else if (nums[right + 1] + currSum > target) {
                left = right++ + 1;
            } else if (nums[right + 1] + currSum < target) {
                right++;
            }
        }
        return minlen;
    }

    public static void main(String[] args) {
        int a[] = {6, 3, 5, 2};
        int p = 9;
        System.out.println(subArrayMinLen(a, p));
    }

}
