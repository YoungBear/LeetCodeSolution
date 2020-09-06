/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/24 22:35
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1133Test {
    private LeetCode1133 leetCode1133;

    @Before
    public void init() {
        leetCode1133 = new LeetCode1133();
    }

    @Test
    public void test1() {
        int[] A = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        int largest = leetCode1133.largestUniqueNumber(A);
        Assert.assertEquals(8, largest);
    }

    @Test
    public void test2() {
        int[] A = {9, 9, 8, 8};
        int largest = leetCode1133.largestUniqueNumber(A);
        Assert.assertEquals(-1, largest);
    }
}
