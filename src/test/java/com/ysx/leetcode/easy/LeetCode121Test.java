/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/19 23:32
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode121Test {
    @Test
    public void test1() {
        LeetCode121 leetCode121 = new LeetCode121();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int excepted = 5;
        Assert.assertEquals(excepted, leetCode121.maxProfit(prices));
    }

    @Test
    public void test2() {
        LeetCode121 leetCode121 = new LeetCode121();
        int[] prices = {7, 6, 4, 3, 1};
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode121.maxProfit(prices));
    }
}
