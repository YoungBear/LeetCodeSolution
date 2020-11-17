/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/17 23:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode746Test {
    @Test
    public void test1() {
        LeetCode746 leetCode746 = new LeetCode746();
        int[] cost = {10, 15, 20};
        int excepted = 15;
        Assert.assertEquals(excepted, leetCode746.minCostClimbingStairs(cost));
    }

    @Test
    public void test2() {
        LeetCode746 leetCode746 = new LeetCode746();
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int excepted = 6;
        Assert.assertEquals(excepted, leetCode746.minCostClimbingStairs(cost));
    }
}
