/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/14 23:53
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1122Test {
    @Test
    public void test1() {
        LeetCode1122 leetCode1122 = new LeetCode1122();
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] excepted = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        int[] result = leetCode1122.relativeSortArray(arr1, arr2);
        Assert.assertArrayEquals(excepted, result);
    }

    @Test
    public void test2() {
        LeetCode1122 leetCode1122 = new LeetCode1122();
        int[] arr1 = {28, 6, 22, 8, 44, 17};
        int[] arr2 = {22, 28, 8, 6};
        int[] excepted = {22, 28, 8, 6, 17, 44};
        int[] result = leetCode1122.relativeSortArray(arr1, arr2);
        Assert.assertArrayEquals(excepted, result);
    }
}
