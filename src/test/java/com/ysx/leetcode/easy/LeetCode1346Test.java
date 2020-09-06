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
 * @date 2020/2/15 9:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1346Test {
    private LeetCode1346 leetCode1346;

    @Before
    public void init() {
        leetCode1346 = new LeetCode1346();
    }

    @Test
    public void test1() {
        int[] arr = {10, 2, 5, 3};
        Assert.assertTrue(leetCode1346.checkIfExist(arr));
    }

    @Test
    public void test2() {
        int[] arr = {7, 1, 14, 11};
        Assert.assertTrue(leetCode1346.checkIfExist(arr));
    }

    @Test
    public void test3() {
        int[] arr = {3, 1, 7, 11};
        Assert.assertFalse(leetCode1346.checkIfExist(arr));
    }
}
