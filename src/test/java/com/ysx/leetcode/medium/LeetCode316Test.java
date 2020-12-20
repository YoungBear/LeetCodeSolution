/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/20 18:17
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode316Test {
    @Test
    public void test1() {
        LeetCode316 leetCode316 = new LeetCode316();
        String s = "bcabc";
        String excepted = "abc";
        Assert.assertEquals(excepted, leetCode316.removeDuplicateLetters(s));
    }

    @Test
    public void test2() {
        LeetCode316 leetCode316 = new LeetCode316();
        String s = "cbacdcbc";
        String excepted = "acdb";
        Assert.assertEquals(excepted, leetCode316.removeDuplicateLetters(s));
    }
}
