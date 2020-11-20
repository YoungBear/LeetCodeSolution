/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/20 23:25
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode122Test {
    @Test
    public void test1() {
        LeetCode122 leetCode122 = new LeetCode122();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int excepted = 7;
        Assert.assertEquals(excepted, leetCode122.maxProfit(prices));
    }

    @Test
    public void test2() {
        LeetCode122 leetCode122 = new LeetCode122();
        int[] prices = {1, 2, 3, 4, 5};
        int excepted = 4;
        Assert.assertEquals(excepted, leetCode122.maxProfit(prices));
    }

    @Test
    public void test3() {
        LeetCode122 leetCode122 = new LeetCode122();
        int[] prices = {7, 6, 4, 3, 1};
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode122.maxProfit(prices));
    }
}
