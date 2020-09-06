/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/28 22:25
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode802Test {
    @Test
    public void test1() {
        LeetCode802 leetCode802 = new LeetCode802();
        String[] words = {"time", "me", "bell"};
        int excepted = 10;
        Assert.assertEquals(excepted, leetCode802.minimumLengthEncoding(words));
    }
}
