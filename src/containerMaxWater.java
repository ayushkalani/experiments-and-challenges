package com.ayush;

public class containerMaxWater {

    public static int maxArea(int[] height) {
        int area = 0, n = height.length;
        int left = 0, right = n - 1;
        int cVertical;
        for (int i = 0; i < n; i++) {
            cVertical = Math.min(height[left], height[right]);
            area = Math.max(area, (right - left) * cVertical);
            if (left + 1 <= n - 1 && height[left + 1] > cVertical) left++;
            if (right - 1 >= 0 && height[right - 1] > cVertical) right--;
        }
        return area;
    }

    public static void main(String[] args) {
        int a[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int b[] = {1, 2,4,3};
        System.out.println(maxArea(a));
    }
}
