/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/4 22:26
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode238Test {
    @Test
    public void test1() {
        LeetCode238 leetCode238 = new LeetCode238();
        int[] nums = {1, 2, 3, 4};
        int[] excepted = {24, 12, 8, 6};
        Assert.assertArrayEquals(excepted, leetCode238.productExceptSelf(nums));
    }
}
