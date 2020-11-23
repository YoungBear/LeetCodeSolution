/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/23 23:30
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode55Test {
    @Test
    public void test1() {
        LeetCode55 leetCode55 = new LeetCode55();
        int[] nums = {2, 3, 1, 1, 4};
        Assert.assertTrue(leetCode55.canJump(nums));
    }

    @Test
    public void test2() {
        LeetCode55 leetCode55 = new LeetCode55();
        int[] nums = {3, 2, 1, 0, 4};
        Assert.assertFalse(leetCode55.canJump(nums));
    }
}
