/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/1 0:02
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview1714Test {
    @Test
    public void test1() {
        Interview1714 interview1714 = new Interview1714();
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
        int k = 4;
        int[] excepted = {1, 2, 3, 4};
        Assert.assertArrayEquals(excepted, interview1714.smallestK(arr, k));
    }
}
