/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/19 10:02
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1491Test {
    @Test
    public void test1() {
        LeetCode1491 leetCode1491 = new LeetCode1491();
        int[] salary = {4000, 3000, 1000, 2000};
        double excepted = 2500.00000d;
        Assert.assertEquals(excepted, leetCode1491.average(salary), 0.000001d);
    }

    @Test
    public void test2() {
        LeetCode1491 leetCode1491 = new LeetCode1491();
        int[] salary = {1000, 2000, 3000};
        double excepted = 2000.00000d;
        Assert.assertEquals(excepted, leetCode1491.average(salary), 0.000001d);
    }

    @Test
    public void test3() {
        LeetCode1491 leetCode1491 = new LeetCode1491();
        int[] salary = {6000, 5000, 4000, 3000, 2000, 1000};
        double excepted = 3500.00000d;
        Assert.assertEquals(excepted, leetCode1491.average(salary), 0.000001d);
    }

    @Test
    public void test4() {
        LeetCode1491 leetCode1491 = new LeetCode1491();
        int[] salary = {8000, 9000, 2000, 3000, 6000, 1000};
        double excepted = 4750.00000d;
        Assert.assertEquals(excepted, leetCode1491.average(salary), 0.000001d);
    }
}
