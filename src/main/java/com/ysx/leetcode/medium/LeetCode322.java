package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/27 21:51
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 322. 零钱兑换
 * https://leetcode-cn.com/problems/coin-change/
 */
public class LeetCode322 {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }
        return coinChange(coins, amount, new int[amount]);
    }

    /**
     * 动态规划-自上而下
     *
     * @param coins
     * @param rem
     * @param count
     * @return
     */
    private int coinChange(int[] coins, int rem, int[] count) {
        if (rem < 0) {
            return -1;
        }
        if (rem == 0) {
            return 0;
        }
        if (count[rem - 1] != 0) {
            return count[rem - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange(coins, rem - coin, count);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }

}
