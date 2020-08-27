package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/8/27 21:46
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1337Test {
    @Test
    public void test1() {
        LeetCode1337 leetCode1337 = new LeetCode1337();
        int[][] mat = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k = 3;
        int[] excepted = {2, 0, 3};
        Assert.assertArrayEquals(excepted, leetCode1337.kWeakestRows(mat, k));
    }

    @Test
    public void test2() {
        LeetCode1337 leetCode1337 = new LeetCode1337();
        int[][] mat = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int k = 2;
        int[] excepted = {0, 2};
        Assert.assertArrayEquals(excepted, leetCode1337.kWeakestRows(mat, k));
    }
}
