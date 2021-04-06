package com.ayush;

public class islandperimeter {

    public static int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int perimeter = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) perimeter += count(grid, i, j, r, c);
            }
        }
        return perimeter;
    }

    public static int count(int[][] grid, int i, int j, int r, int c) {
        int count = 4;
        if (i + 1 < r && grid[i + 1][j] == 1) count--;
        if (j + 1 < c && grid[i][j + 1] == 1) count--;
        if (i - 1 >= 0 && grid[i - 1][j] == 1) count--;
        if (j - 1 >= 0 && grid[i][j - 1] == 1) count--;
        return count;
    }

    public static void main(String[] args) {
        int[][] ocean = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        System.out.println(islandPerimeter(ocean));
    }
}
