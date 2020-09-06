/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.advanced;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/12 22:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode4Test {
    @Test
    public void findMedianSortedArraysTest() {
        LeetCode4 leetCode4 = new LeetCode4();

        int[] num1 = {1, 3};
        int[] num2 = {2};
        Assert.assertEquals(2.0,
                leetCode4.findMedianSortedArrays(num1, num2), 0.000001d);

        int[] num1_1 = {1, 2};
        int[] num2_1 = {3,4};
        Assert.assertEquals(2.5,
                leetCode4.findMedianSortedArrays(num1_1, num2_1), 0.000001d);
    }
}
