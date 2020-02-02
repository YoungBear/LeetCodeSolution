package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/2 13:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1228Test {

    private LeetCode1228 leetCode1228;

    @Before
    public void init() {
        leetCode1228 = new LeetCode1228();
    }

    @Test
    public void test1() {
        int[] arr = {5, 7, 11, 13};
        Assert.assertEquals(9, leetCode1228.missingNumber(arr));
    }

    @Test
    public void test2() {
        int[] arr = {15, 13, 12};
        Assert.assertEquals(14, leetCode1228.missingNumber(arr));
    }

    @Test
    public void test3() {
        int[] arr = {0, 0, 0, 0, 0};
        Assert.assertEquals(0, leetCode1228.missingNumber(arr));
    }

    @Test
    public void test4() {
        int[] arr = {1, 2, 3, 5};
        Assert.assertEquals(4, leetCode1228.missingNumber(arr));
    }
}
