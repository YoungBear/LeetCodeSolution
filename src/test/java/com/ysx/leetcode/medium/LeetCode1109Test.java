/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/26 22:21
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1109Test {
    @Test
    public void test1() {
        LeetCode1109 leetCode1109 = new LeetCode1109();
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int n = 5;
        int[] excepted = {10, 55, 45, 25, 25};
        Assert.assertArrayEquals(excepted, leetCode1109.corpFlightBookings(bookings, n));
    }
}
