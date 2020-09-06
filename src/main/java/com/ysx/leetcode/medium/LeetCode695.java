/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/15 20:55
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 695. 岛屿的最大面积
 * https://leetcode-cn.com/problems/max-area-of-island/
 */
public class LeetCode695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (1 == grid[i][j]) {
                    max = Math.max(max, getArea(i, j, grid));
                }
            }
        }
        return max;
    }

    private int getArea(int i, int j, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }
        if (1 == grid[i][j]) {
            // 为了确保每个土地访问不超过一次，我们每次经过一块土地时，将这块土地的值置为 0。这样我们就不会多次访问同一土地。
            grid[i][j] = 0;
            // 递归，向上下左右四个方向扩展
            return 1 + getArea(i - 1, j, grid) + getArea(i + 1, j, grid) + getArea(i, j - 1, grid) + getArea(i, j + 1, grid);
        } else {
            return 0;
        }
    }
}
