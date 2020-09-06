/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/9 19:42
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode59Test {
    @Test
    public void test1() {
        LeetCode59 leetCode59 = new LeetCode59();
        int n = 3;
        int[][] excepted = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        int[][] matrix = leetCode59.generateMatrix(n);
        Assert.assertArrayEquals(excepted, matrix);
    }
}
