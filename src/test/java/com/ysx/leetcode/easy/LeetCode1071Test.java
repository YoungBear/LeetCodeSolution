/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/15 20:48
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1071Test {
    @Test
    public void test1() {
        LeetCode1071 leetCode1071 = new LeetCode1071();
        String str1 = "ABCABC";
        String str2 = "ABC";
        String excepted = "ABC";
        Assert.assertEquals(excepted, leetCode1071.gcdOfStrings(str1, str2));
    }

    @Test
    public void test2() {
        LeetCode1071 leetCode1071 = new LeetCode1071();
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String excepted = "AB";
        Assert.assertEquals(excepted, leetCode1071.gcdOfStrings(str1, str2));
    }

    @Test
    public void test3() {
        LeetCode1071 leetCode1071 = new LeetCode1071();
        String str1 = "LEET";
        String str2 = "CODE";
        String excepted = "";
        Assert.assertEquals(excepted, leetCode1071.gcdOfStrings(str1, str2));
    }
}
