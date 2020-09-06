/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/7 21:44
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode344Test {
    @Test
    public void reverseStringTest() {
        LeetCode344 demo = new LeetCode344();
        char[] s1 = "hello".toCharArray();
        demo.reverseString(s1);
        Assert.assertEquals("olleh", String.valueOf(s1));

        char[] s2 = "Hannah".toCharArray();
        demo.reverseString(s2);
        Assert.assertEquals("hannaH", String.valueOf(s2));
    }
}
