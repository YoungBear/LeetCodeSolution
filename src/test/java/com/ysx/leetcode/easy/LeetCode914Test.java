package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/27 20:51
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode914Test {
    @Test
    public void test1() {
        LeetCode914 leetCode914 = new LeetCode914();
        int[] deck = {1, 2, 3, 4, 4, 3, 2, 1};
        Assert.assertTrue(leetCode914.hasGroupsSizeX(deck));
    }

    @Test
    public void test2() {
        LeetCode914 leetCode914 = new LeetCode914();
        int[] deck = {1, 1, 1, 2, 2, 2, 3, 3};
        Assert.assertFalse(leetCode914.hasGroupsSizeX(deck));
    }

    @Test
    public void test3() {
        LeetCode914 leetCode914 = new LeetCode914();
        int[] deck = {1};
        Assert.assertFalse(leetCode914.hasGroupsSizeX(deck));
    }

    @Test
    public void test4() {
        LeetCode914 leetCode914 = new LeetCode914();
        int[] deck = {1, 1};
        Assert.assertTrue(leetCode914.hasGroupsSizeX(deck));
    }

    @Test
    public void test5() {
        LeetCode914 leetCode914 = new LeetCode914();
        int[] deck = {1, 1, 2, 2, 2, 2};
        Assert.assertTrue(leetCode914.hasGroupsSizeX(deck));
    }

    @Test
    public void test6() {
        LeetCode914 leetCode914 = new LeetCode914();
        int[] deck = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
        Assert.assertTrue(leetCode914.hasGroupsSizeX(deck));
    }

    @Test
    public void test7() {
        LeetCode914 leetCode914 = new LeetCode914();
        int[] deck = {0, 0, 0, 1, 1, 1, 2, 2, 2};
        Assert.assertTrue(leetCode914.hasGroupsSizeX(deck));
    }

}
