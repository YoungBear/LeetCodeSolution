package com.ysx.leetcode.easy;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/4 19:45
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 994. 腐烂的橘子
 * https://leetcode-cn.com/problems/rotting-oranges/
 */
public class LeetCode994 {
    public int orangesRotting(int[][] grid) {
        boolean isChanged = true;
        int minutes = 0;
        while (true) {
            isChanged = false;
            int[][] tempGrid = new int[grid.length][grid[0].length];
            for (int i = 0; i < tempGrid.length; i++) {
                for (int j = 0; j < tempGrid[0].length; j++) {
                    tempGrid[i][j] = grid[i][j];
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (2 == grid[i][j]) {
                        if (i > 0 && 1 == tempGrid[i - 1][j]) {
                            tempGrid[i - 1][j] = 2;
                            isChanged = true;
                        }
                        if (i < grid.length - 1 && 1 == tempGrid[i + 1][j]) {
                            tempGrid[i + 1][j] = 2;
                            isChanged = true;
                        }
                        if (j > 0 && 1 == tempGrid[i][j - 1]) {
                            tempGrid[i][j - 1] = 2;
                            isChanged = true;
                        }
                        if (j < grid[0].length - 1 && 1 == tempGrid[i][j + 1]) {
                            tempGrid[i][j + 1] = 2;
                            isChanged = true;
                        }
                    }
                }
            }
            // 如果状态没有变化，则停止循环
            if (!isChanged) {
                break;
            }
            grid = tempGrid;
            minutes++;
        }
        if (isAllCorrupt(grid)) {
            return minutes;
        } else {
            return -1;
        }
    }

    /**
     * 判断是否全部已经腐烂
     *
     * @param grid
     * @return
     */
    private boolean isAllCorrupt(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (1 == grid[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
