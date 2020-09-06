/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/12 09:28
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode443Test {
    @Test
    public void test() {
        LeetCode443 leetCode443 = new LeetCode443();
        char[] chars1 = {'a','a','b','b','c','c','c'};
        int num1 = 6;
        Assert.assertEquals(num1, leetCode443.compress(chars1));

        char[] chars2 = {'a'};
        int num2 = 1;
        Assert.assertEquals(num2, leetCode443.compress(chars2));

        char[] chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int num3 = 4;
        Assert.assertEquals(num3, leetCode443.compress(chars3));
    }
}
