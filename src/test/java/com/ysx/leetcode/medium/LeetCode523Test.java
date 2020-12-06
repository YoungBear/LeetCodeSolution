/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 15:40
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode523Test {
    @Test
    public void test1() {
        LeetCode523 leetCode523 = new LeetCode523();
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        Assert.assertTrue(leetCode523.checkSubarraySum(nums, k));
    }

    @Test
    public void test2() {
        LeetCode523 leetCode523 = new LeetCode523();
        int[] nums = {23, 2, 6, 4, 7};
        int k = 6;
        Assert.assertTrue(leetCode523.checkSubarraySum(nums, k));
    }

}
