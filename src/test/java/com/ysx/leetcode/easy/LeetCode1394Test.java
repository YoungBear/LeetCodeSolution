package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/4 20:39
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1394Test {
    @Test
    public void test1() {
        LeetCode1394 leetCode1394 = new LeetCode1394();
        int[] arr = {2, 2, 3, 4};
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode1394.findLucky(arr));
    }

    @Test
    public void test2() {
        LeetCode1394 leetCode1394 = new LeetCode1394();
        int[] arr = {1, 2, 2, 3, 3, 3};
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode1394.findLucky(arr));
    }

    @Test
    public void test3() {
        LeetCode1394 leetCode1394 = new LeetCode1394();
        int[] arr = {2, 2, 2, 3, 3};
        int excepted = -1;
        Assert.assertEquals(excepted, leetCode1394.findLucky(arr));
    }

    @Test
    public void test4() {
        LeetCode1394 leetCode1394 = new LeetCode1394();
        int[] arr = {5};
        int excepted = -1;
        Assert.assertEquals(excepted, leetCode1394.findLucky(arr));
    }

    @Test
    public void test5() {
        LeetCode1394 leetCode1394 = new LeetCode1394();
        int[] arr = {7, 7, 7, 7, 7, 7, 7};
        int excepted = 7;
        Assert.assertEquals(excepted, leetCode1394.findLucky(arr));
    }
}
