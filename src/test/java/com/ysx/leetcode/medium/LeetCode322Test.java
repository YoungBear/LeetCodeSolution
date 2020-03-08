package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/27 21:52
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode322Test {
    @Test
    public void test1() {
        LeetCode322 leetCode322 = new LeetCode322();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode322.coinChange(coins, amount));
    }

    @Test
    public void test2() {
        LeetCode322 leetCode322 = new LeetCode322();
        int[] coins = {2};
        int amount = 3;
        int excepted = -1;
        Assert.assertEquals(excepted, leetCode322.coinChange(coins, amount));
    }

    @Test
    public void test3() {
        LeetCode322 leetCode322 = new LeetCode322();
        int[] coins = {1};
        int amount = 0;
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode322.coinChange(coins, amount));
    }

    @Test
    public void test4() {
        LeetCode322 leetCode322 = new LeetCode322();
        int[] coins = {2};
        int amount = 1;
        int excepted = -1;
        Assert.assertEquals(excepted, leetCode322.coinChange(coins, amount));
    }

    @Test
    public void test5() {
        LeetCode322 leetCode322 = new LeetCode322();
        int[] coins = {1, 2147483647};
        int amount = 2;
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode322.coinChange(coins, amount));
    }

    @Test
    public void test6() {
        LeetCode322 leetCode322 = new LeetCode322();
        int[] coins = {186, 419, 83, 408};
        int amount = 6249;
        int excepted = 20;
        Assert.assertEquals(excepted, leetCode322.coinChange(coins, amount));
    }
}
