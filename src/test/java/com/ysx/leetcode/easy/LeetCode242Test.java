/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/22 12:33
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode242Test {
    @Test
    public void test1() {
        LeetCode242 leetCode242 = new LeetCode242();
        String s = "anagram";
        String t = "nagaram";
        Assert.assertTrue(leetCode242.isAnagram(s, t));
    }

    @Test
    public void test2() {
        LeetCode242 leetCode242 = new LeetCode242();
        String s = "rat";
        String t = "car";
        Assert.assertFalse(leetCode242.isAnagram(s, t));
    }
}
