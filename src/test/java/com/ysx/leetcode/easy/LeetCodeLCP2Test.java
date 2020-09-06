/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/18 08:39
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCodeLCP2Test {
    @Test
    public void fractionTest() {
        LeetCodeLCP2 demo = new LeetCodeLCP2();
        int[] cont1 = {3, 2, 0, 2};
        int[] fraction1 = demo.fraction(cont1);
        Assert.assertEquals(13, fraction1[0]);
        Assert.assertEquals(4, fraction1[1]);

        int[] cont2 = {0, 0, 3};
        int[] fraction2 = demo.fraction(cont2);
        Assert.assertEquals(3, fraction2[0]);
        Assert.assertEquals(1, fraction2[1]);
    }
}
