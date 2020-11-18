/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/18 22:57
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 63. 不同路径 II
 * https://leetcode-cn.com/problems/unique-paths-ii/
 */
public class LeetCode63 {
    /**
     * 动态规划
     *
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m <= 0) {
            return 0;
        }
        int n = obstacleGrid[0].length;
        if (n <= 0) {
            return 0;
        }
        int[][] dp = new int[m][n];
        // iBlock表示第1列数据是否有障碍，有障碍后，其后的值均为0
        boolean iBlock = false;
        for (int i = 0; i < m; i++) {
            if (iBlock) {
                dp[i][0] = 0;
            } else {
                if (obstacleGrid[i][0] == 1) {
                    iBlock = true;
                    dp[i][0] = 0;
                } else {
                    dp[i][0] = 1;
                }
            }
        }
        boolean jBlock = false;
        for (int j = 0; j < n; j++) {
            if (jBlock) {
                dp[0][j] = 0;
            } else {
                if (obstacleGrid[0][j] == 1) {
                    jBlock = true;
                    dp[0][j] = 0;
                } else {
                    dp[0][j] = 1;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // 有障碍，则该节点dp为0
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                // 状态转移方程
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
