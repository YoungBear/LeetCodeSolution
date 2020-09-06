/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/26 22:37
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode268Test {
    @Test
    public void test1() {
        LeetCode268 leetCode268 = new LeetCode268();
        int[] nums = {3, 0, 1};
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode268.missingNumber(nums));
    }

    @Test
    public void test2() {
        LeetCode268 leetCode268 = new LeetCode268();
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int excepted = 8;
        Assert.assertEquals(excepted, leetCode268.missingNumber(nums));
    }
}
