/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/30 23:49
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview1709Test {
    @Test
    public void test1() {
        Interview1709 interview1709 = new Interview1709();
        int k = 5;
        int excepted = 9;
        Assert.assertEquals(excepted, interview1709.getKthMagicNumber(k));
    }

    @Test
    public void test2() {
        Interview1709 interview1709 = new Interview1709();
        int k = 1;
        int excepted = 1;
        Assert.assertEquals(excepted, interview1709.getKthMagicNumber(k));
    }
}
