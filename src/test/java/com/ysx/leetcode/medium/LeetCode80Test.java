/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import com.ysx.leetcode.medium.LeetCode80;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/13 14:35
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode80Test {
    private LeetCode80 leetCode80;

    @Before
    public void init() {
        leetCode80 = new LeetCode80();
    }

    @Test
    public void test1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int length = leetCode80.removeDuplicates(nums);
        Assert.assertEquals(5, length);
        Assert.assertEquals(1, nums[0]);
        Assert.assertEquals(1, nums[1]);
        Assert.assertEquals(2, nums[2]);
        Assert.assertEquals(2, nums[3]);
        Assert.assertEquals(3, nums[4]);
    }

    @Test
    public void test2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int length = leetCode80.removeDuplicates(nums);
        Assert.assertEquals(7, length);
        Assert.assertEquals(0, nums[0]);
        Assert.assertEquals(0, nums[1]);
        Assert.assertEquals(1, nums[2]);
        Assert.assertEquals(1, nums[3]);
        Assert.assertEquals(2, nums[4]);
        Assert.assertEquals(3, nums[5]);
        Assert.assertEquals(3, nums[6]);
    }
}
