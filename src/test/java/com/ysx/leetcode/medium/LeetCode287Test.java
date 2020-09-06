/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/26 23:16
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode287Test {
    @Test
    public void test1() {
        LeetCode287 leetCode287 = new LeetCode287();
        int[] nums = {1, 3, 4, 2, 2};
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode287.findDuplicate(nums));
    }

    @Test
    public void test2() {
        LeetCode287 leetCode287 = new LeetCode287();
        int[] nums = {3, 1, 3, 4, 2};
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode287.findDuplicate(nums));
    }
}
