package com.ysx.leetcode.medium;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/12 08:26
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 完全平方数
 * LeetCode 279. 完全平方数
 * 动态规划
 */
public class LeetCode279 {

    /**
     * 动态规划
     *
     * @param n
     * @return
     */
    public int numSquares(int n) {
        // dp[i] 用来存储组成正整数i的最小的完全平方数的个数
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // 最大的下标，即 maxSquareIndex 的平方肯定大于 n
        int maxSquareIndex = (int) (Math.sqrt(n) + 1);
        // 完全平方数
        int[] squareNums = new int[maxSquareIndex];
        for (int i = 1; i < maxSquareIndex; i++) {
            squareNums[i] = i * i;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < maxSquareIndex; j++) {
                if (i < squareNums[j]) {
                    break;
                }
                dp[i] = Math.min(dp[i], dp[i - squareNums[j]] + 1);
            }
        }
        return dp[n];
    }
}
