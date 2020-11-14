/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/15 0:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 5. 最长回文子串
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 * 动态规划
 */
public class LeetCode5 {
    /**
     * 动态规划
     * dp[i][j] 表示从i到j的字符串（即s.subString(i, j+1）是否为回文串
     * 状态转移方程：dp[i][j] = S(i) == S(j) && dp[i+1, j-1]
     * 注意循环的顺序，先取计算短的数据，再计算长的数据
     * 即第一步计算dp[0][0], dp[1][1],dp[2][2]...dp[n-1][n-1]
     * 第二步计算 dp[0][1], dp[1][2], dp[2][3]...dp[n-2][n-1]
     * ...
     * dp[0][n-1], dp[1][n-1]
     * 时间复杂度 O(n*n)
     * 空间复杂度 O(n*n)
     *
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
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
                if (dp[i][j] && j - i + 1 > ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }

    /**
     * 中心扩展法
     * 时间复杂度 O(n*n)
     * 空间复杂度 O(1)
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int begin = 0; // 子串的开始下标
        int end = 0; // 子串的结束下标
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandCenter(s, i, i);
            int len2 = expandCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - begin) {
                // 如果len为奇数，begin = i - (len - 1) / 2， end = i + (len - 1) / 2
                // 如果len为偶数，begin = i - len / 2 + 1， end = i + len / 2
                // 两种情况可以合在一起
                begin = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(begin, end + 1);
    }

    /**
     * 将字符串s以left，right为中心向两侧扩展，获取最大的回文串的长度值
     *
     * @param s
     * @param left
     * @param right
     * @return
     */
    private int expandCenter(String s, int left, int right) {
        int L = left;
        int R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        // 注意循环终止条件，此时长度为(R+1)-(L-1)+1，即R-L-1
        return R - L - 1;
    }
}
