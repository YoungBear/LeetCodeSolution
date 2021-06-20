/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/20 18:37
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode495Test {

    @Test
    public void test1() {
        LeetCode495 leetCode495 = new LeetCode495();
        int[] timeSeries = {1, 4};
        int duration = 2;
        int excepted = 4;
        Assert.assertEquals(excepted, leetCode495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    public void test2() {
        LeetCode495 leetCode495 = new LeetCode495();
        int[] timeSeries = {1, 2};
        int duration = 2;
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode495.findPoisonedDuration(timeSeries, duration));
    }
}
