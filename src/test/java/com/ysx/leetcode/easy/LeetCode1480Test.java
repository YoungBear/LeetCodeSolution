/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/21 16:28
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1480Test {
    @Test
    public void test1() {
        LeetCode1480 leetCode1480 = new LeetCode1480();
        int[] nums = {1, 2, 3, 4};
        int[] excepted = {1, 3, 6, 10};
        Assert.assertArrayEquals(excepted, leetCode1480.runningSum(nums));
    }

    @Test
    public void test2() {
        LeetCode1480 leetCode1480 = new LeetCode1480();
        int[] nums = {1, 1, 1, 1, 1};
        int[] excepted = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(excepted, leetCode1480.runningSum(nums));
    }

    @Test
    public void test3() {
        LeetCode1480 leetCode1480 = new LeetCode1480();
        int[] nums = {3, 1, 2, 10, 1};
        int[] excepted = {3, 4, 6, 16, 17};
        Assert.assertArrayEquals(excepted, leetCode1480.runningSum(nums));
    }
}
