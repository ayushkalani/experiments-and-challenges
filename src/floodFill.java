package com.ayush;

import java.util.Arrays;

public class floodFill {

    public static int[][] dfs(int[][] image, int sr, int sc, int checkColor, int newColor) {
        int r = image.length;
        int c = image[0].length;
        if (sr + 1 < r && image[sr + 1][sc] == checkColor) {
            image[sr + 1][sc] = newColor;
            dfs(image, sr + 1, sc, checkColor, newColor);
        }
        if (sr - 1 >= 0 && image[sr - 1][sc] == checkColor) {
            image[sr - 1][sc] = newColor;
            dfs(image, sr - 1, sc, checkColor, newColor);
        }
        if (sc + 1 < c && image[sr][sc + 1] == checkColor) {
            image[sr][sc + 1] = newColor;
            dfs(image, sr, sc + 1, checkColor, newColor);
        }
        if (sc - 1 >= 0 && image[sr][sc - 1] == checkColor) {
            image[sr][sc - 1] = newColor;
            dfs(image, sr, sc - 1, checkColor, newColor);
        }
        return image;
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int k = image[sr][sc];
        image[sr][sc] = newColor;
        if (k == newColor) return image;
        return dfs(image, sr, sc, k, newColor);
    }

    public static void main(String[] args) {
        int[][] test = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println(Arrays.deepToString(floodFill(test, 1, 1, 1)));
    }
}
