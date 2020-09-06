/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/12 19:26
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode26Test {
    private LeetCode26 leetCode26;

    @Before
    public void init() {
        leetCode26 = new LeetCode26();
    }

    @Test
    public void test1() {
        int[] nums = {1, 1, 2};
        int length = leetCode26.removeDuplicates(nums);
        Assert.assertEquals(2, length);
        Assert.assertEquals(1, nums[0]);
        Assert.assertEquals(2, nums[1]);
    }

    @Test
    public void test2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = leetCode26.removeDuplicates(nums);
        Assert.assertEquals(5, length);
        Assert.assertEquals(0, nums[0]);
        Assert.assertEquals(1, nums[1]);
        Assert.assertEquals(2, nums[2]);
        Assert.assertEquals(3, nums[3]);
        Assert.assertEquals(4, nums[4]);
    }
}
