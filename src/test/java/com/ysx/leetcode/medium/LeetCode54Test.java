/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/9 19:37
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode54Test {
    @Test
    public void test1() {
        LeetCode54 leetCode54 = new LeetCode54();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> excepted = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        List<Integer> integers = leetCode54.spiralOrder(matrix);
        for (int i = 0; i < excepted.size(); i++) {
            Assert.assertEquals(excepted.get(i), integers.get(i));
        }
    }

    @Test
    public void test2() {
        LeetCode54 leetCode54 = new LeetCode54();
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> excepted = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        List<Integer> integers = leetCode54.spiralOrder(matrix);
        for (int i = 0; i < excepted.size(); i++) {
            Assert.assertEquals(excepted.get(i), integers.get(i));
        }
    }
}
