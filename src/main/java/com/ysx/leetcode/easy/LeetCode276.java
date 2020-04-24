package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/24 21:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 276. 栅栏涂色
 * 动态规划
 * 有 k 种颜色的涂料和一个包含 n 个栅栏柱的栅栏，每个栅栏柱可以用其中一种颜色进行上色。
 * 你需要给所有栅栏柱上色，并且保证其中相邻的栅栏柱 最多连续两个 颜色相同。然后，返回所有有效涂色的方案数。
 * 注意:
 * n 和 k 均为非负的整数。
 */
public class LeetCode276 {
    /**
     * dp[i] 用来表示i个栅栏柱的涂色的方案数，有两种情况：
     * 如果：i与i-1的颜色相同，则表明i-1与i-2的颜色不同，则i的数目为dp[i-2]*(k-1)
     * 如果：i与i-1的颜色不同，则i的数目为dp[i-1]*(k-1)
     * 则递推公式为：
     * dp[i] = dp[i-2]*(k-1) + dp[i-1]*(k-1)
     *
     * @param n 栅栏柱个数
     * @param k 颜色数
     * @return 方案数
     */
    public int numWays(int n, int k) {
        if (n == 0 || k == 0) {
            return 0;
        }
        if (n == 1) {
            return k;
        }
        if (n == 2) {
            return k * k;
        }
        int[] dp = new int[n];
        dp[0] = k;
        dp[1] = k * k;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 2] * (k - 1) + dp[i - 1] * (k - 1);
        }
        return dp[n - 1];
    }

    /**
     * 优化：使用两个变量pre和cur来保存
     *
     * @param n 栅栏柱个数
     * @param k 颜色数
     * @return 方案数
     */
    public int numWaysOptimize(int n, int k) {
        if (n == 0 || k == 0) {
            return 0;
        }
        if (n == 1) {
            return k;
        }
        if (n == 2) {
            return k * k;
        }
        int pre = k;
        int cur = k * k;
        for (int i = 2; i < n; i++) {
            int next = pre * (k - 1) + cur * (k - 1);
            pre = cur;
            cur = next;
        }
        return cur;
    }
}
