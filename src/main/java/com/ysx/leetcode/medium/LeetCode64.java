/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/18 22:45
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 64. 最小路径和
 * https://leetcode-cn.com/problems/minimum-path-sum/
 */
public class LeetCode64 {
    /**
     * 动态规划
     * dp[i][j]表示点(i,j)的最小路径
     * 状态转移方程：
     * dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
     * 起始状态：
     * dp[0][0] = grid[0][0];
     * dp[i][0] = dp[i - 1][0] + grid[i][0];
     * dp[0][j] = dp[0][j - 1] + grid[0][j];
     * 结果：
     * dp[m - 1][n - 1];
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}
