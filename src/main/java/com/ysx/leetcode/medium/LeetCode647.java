/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/15 15:10
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 647. 回文子串
 * https://leetcode-cn.com/problems/palindromic-substrings/
 */
public class LeetCode647 {
    /**
     * 参考LeetCode 5
     * 动态规划获取所有的子串是否为回文串
     *
     * @param s
     * @return
     */
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int ans = 0;
        for (int step = 0; step < n; step++) {
            for (int i = 0; i + step < n; i++) {
                int j = i + step;
                if (0 == step) {
                    dp[i][j] = true;
                } else if (1 == step) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }
                if (dp[i][j]) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
