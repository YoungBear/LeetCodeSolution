package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/26 22:25
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1094Test {
    @Test
    public void test1() {
        LeetCode1094 leetCode1094 = new LeetCode1094();
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        Assert.assertFalse(leetCode1094.carPooling(trips, capacity));
    }

    @Test
    public void test2() {
        LeetCode1094 leetCode1094 = new LeetCode1094();
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 5;
        Assert.assertTrue(leetCode1094.carPooling(trips, capacity));
    }

    @Test
    public void test3() {
        LeetCode1094 leetCode1094 = new LeetCode1094();
        int[][] trips = {{2, 1, 5}, {3, 5, 7}};
        int capacity = 3;
        Assert.assertTrue(leetCode1094.carPooling(trips, capacity));
    }

    @Test
    public void test4() {
        LeetCode1094 leetCode1094 = new LeetCode1094();
        int[][] trips = {{3, 2, 7}, {3, 7, 9}, {8, 3, 9}};
        int capacity = 11;
        Assert.assertTrue(leetCode1094.carPooling(trips, capacity));
    }
}
