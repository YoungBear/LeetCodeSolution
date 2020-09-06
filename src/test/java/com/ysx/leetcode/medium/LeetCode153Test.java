/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/22 13:47
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode153Test {
    @Test
    public void test1() {
        LeetCode153 leetCode153 = new LeetCode153();
        int[] nums = {3, 4, 5, 1, 2};
        int excepted = 1;
        Assert.assertEquals(excepted, leetCode153.findMin(nums));
    }

    @Test
    public void test2() {
        LeetCode153 leetCode153 = new LeetCode153();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode153.findMin(nums));
    }

    @Test
    public void test3() {
        LeetCode153 leetCode153 = new LeetCode153();
        int[] nums = {0, 1, 2};
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode153.findMin(nums));
    }

    @Test
    public void test4() {
        LeetCode153 leetCode153 = new LeetCode153();
        int[] nums = {4, 5, 6, 7, 0};
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode153.findMin(nums));
    }
}
