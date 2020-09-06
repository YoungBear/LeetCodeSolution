/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/21 20:37
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode365Test {
    @Test
    public void test1() {
        LeetCode365 leetCode365 = new LeetCode365();
        int x = 3;
        int y = 5;
        int z = 4;
        Assert.assertTrue(leetCode365.canMeasureWater(x, y, z));
    }

    @Test
    public void test2() {
        LeetCode365 leetCode365 = new LeetCode365();
        int x = 2;
        int y = 6;
        int z = 5;
        Assert.assertFalse(leetCode365.canMeasureWater(x, y, z));
    }

    @Test
    public void test3() {
        LeetCode365 leetCode365 = new LeetCode365();
        Assert.assertEquals(2, leetCode365.gcd(2, 4));
        Assert.assertEquals(1, leetCode365.gcd(3, 5));
    }
}
