/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/19 23:57
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode283Test {
    @Test
    public void test1() {
        LeetCode283 leetCode283 = new LeetCode283();
        int[] nums = {0, 1, 0, 3, 12};
        int[] excepted = {1, 3, 12, 0, 0};
        leetCode283.moveZeroes(nums);
        Assert.assertArrayEquals(excepted, nums);
    }
}
