package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/4 21:57
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1313Test {
    @Test
    public void test1() {
        LeetCode1313 leetCode1313 = new LeetCode1313();
        int[] nums = {1, 2, 3, 4};
        int[] excepted = {2, 4, 4, 4};
        Assert.assertArrayEquals(excepted, leetCode1313.decompressRLElist(nums));
    }

    @Test
    public void test2() {
        LeetCode1313 leetCode1313 = new LeetCode1313();
        int[] nums = {1, 1, 2, 3};
        int[] excepted = {1, 3, 3};
        Assert.assertArrayEquals(excepted, leetCode1313.decompressRLElist(nums));
    }
}
