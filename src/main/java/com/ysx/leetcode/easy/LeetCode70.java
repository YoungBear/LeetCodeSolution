package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/13 22:17
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 70. 爬楼梯
 * https://leetcode-cn.com/problems/climbing-stairs/
 * 动态规划
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 */
public class LeetCode70 {
    /**
     * 动态规划(空间优化)
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[3];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[2] = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }

    /**
     * 动态规划
     * 数组 dp[n+1]，dp[i]表示i阶楼梯的方法数0<=i&&i<=n
     * dp[0] = 0,dp[1] = 1,dp[2] = 2
     * dp[k]=dp[k-2] + dp[k-1](k>=2)
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     *
     * @param n
     * @return
     */
    public int climbStairsOld(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
}
