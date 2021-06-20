/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/20 18:19
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode162Test {
    @Test
    public void test1() {
        LeetCode162 leetCode162 = new LeetCode162();
        int[] nums = {1, 2, 3, 1};
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode162.findPeakElement(nums));
    }

    @Test
    public void test2() {
        LeetCode162 leetCode162 = new LeetCode162();
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int excepted1 = 1;
        int excepted2 = 5;
        int result = leetCode162.findPeakElement(nums);
        Assert.assertTrue(excepted1 == result || excepted2 == result);
    }
}
