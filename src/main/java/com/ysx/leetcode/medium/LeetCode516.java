/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/15 14:58
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 516. 最长回文子序列
 * https://leetcode-cn.com/problems/longest-palindromic-subsequence/
 * 动态规划
 * 与 LeetCode 5. 最长回文子串的不同是，子串与子序列的区别
 */
public class LeetCode516 {
    /**
     * 最长子序列
     * 动态规划
     * dp[i][j]表示s从i到j的最长子序列的长度
     *
     * @param s
     * @return
     */
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        // 循环顺序：从最后一个开始，往前计算
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                // 状态转移方程
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        // 最终结果
        return dp[0][n - 1];
    }
}
