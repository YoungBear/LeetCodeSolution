package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/30 22:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1497Test {
    @Test
    public void test1() {
        LeetCode1497 leetCode1497 = new LeetCode1497();
        int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
        int k = 5;
        Assert.assertTrue(leetCode1497.canArrange(arr, k));
    }

    @Test
    public void test2() {
        LeetCode1497 leetCode1497 = new LeetCode1497();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 7;
        Assert.assertTrue(leetCode1497.canArrange(arr, k));
    }

    @Test
    public void test3() {
        LeetCode1497 leetCode1497 = new LeetCode1497();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 10;
        Assert.assertFalse(leetCode1497.canArrange(arr, k));
    }

    @Test
    public void test4() {
        LeetCode1497 leetCode1497 = new LeetCode1497();
        int[] arr = {-10, 10};
        int k = 2;
        Assert.assertTrue(leetCode1497.canArrange(arr, k));
    }

    @Test
    public void test5() {
        LeetCode1497 leetCode1497 = new LeetCode1497();
        int[] arr = {-1, 1, -2, 2, -3, 3, -4, 4};
        int k = 3;
        Assert.assertTrue(leetCode1497.canArrange(arr, k));
    }
}
