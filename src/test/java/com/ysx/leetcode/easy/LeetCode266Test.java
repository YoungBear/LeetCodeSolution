/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/19 20:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode266Test {
    @Test
    public void test1() {
        LeetCode266 leetCode266 = new LeetCode266();
        String s = "code";
        Assert.assertFalse(leetCode266.canPermutePalindrome(s));
    }

    @Test
    public void test2() {
        LeetCode266 leetCode266 = new LeetCode266();
        String s = "aab";
        Assert.assertTrue(leetCode266.canPermutePalindrome(s));
    }

    @Test
    public void test3() {
        LeetCode266 leetCode266 = new LeetCode266();
        String s = "carerac";
        Assert.assertTrue(leetCode266.canPermutePalindrome(s));
    }


}
