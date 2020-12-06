/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 16:56
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode325Test {
    @Test
    public void test1() {
        LeetCode325 leetCode325 = new LeetCode325();
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        int excetped = 4;
        Assert.assertEquals(excetped, leetCode325.maxSubArrayLen(nums, k));
    }

    @Test
    public void test2() {
        LeetCode325 leetCode325 = new LeetCode325();
        int[] nums = {-2, -1, 2, 1};
        int k = 1;
        int excetped = 2;
        Assert.assertEquals(excetped, leetCode325.maxSubArrayLen(nums, k));
    }
}
