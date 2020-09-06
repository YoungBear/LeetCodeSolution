/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/9 19:44
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description LCP 07. 传递信息
 * https://leetcode-cn.com/problems/chuan-di-xin-xi/
 */
public class LCP07 {
    /**
     * 二维数组dp，dp[i][j] 表示第i轮传递给编号j的人的方案数
     *
     * @param n
     * @param relation
     * @param k
     * @return
     */
    public int numWays(int n, int[][] relation, int k) {
        int[][] dp = new int[10][15];
        dp[0][0] = 1;
        for (int i = 0; i < k; i++) {
            for (int[] r : relation) {
                dp[i + 1][r[1]] += dp[i][r[0]];
            }
        }
        return dp[k][n - 1];
    }
}
