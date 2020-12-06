/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 16:26
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode724Test {
    @Test
    public void test1() {
        LeetCode724 leetCode724 = new LeetCode724();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode724.pivotIndex(nums));
    }

    @Test
    public void test2() {
        LeetCode724 leetCode724 = new LeetCode724();
        int[] nums = {1, 2, 3};
        int excepted = -1;
        Assert.assertEquals(excepted, leetCode724.pivotIndex(nums));
    }

    @Test
    public void test3() {
        LeetCode724 leetCode724 = new LeetCode724();
        int[] nums = {1, 0};
        int excepted = 0;
        Assert.assertEquals(excepted, leetCode724.pivotIndex(nums));
    }
}
