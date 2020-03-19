package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/19 20:23
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode409Test {
    @Test
    public void test1() {
        LeetCode409 leetCode409 = new LeetCode409();
        String s = "abccccdd";
        int excepted = 7;
        Assert.assertEquals(excepted, leetCode409.longestPalindrome(s));
    }
}
