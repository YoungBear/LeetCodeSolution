/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/8 21:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview1611Test {
    @Test
    public void test1() {
        Interview1611 interview1611 = new Interview1611();
        int shorter = 1;
        int longer = 2;
        int k = 3;
        int[] excepted = {3, 4, 5, 6};
        Assert.assertArrayEquals(excepted, interview1611.divingBoard(shorter, longer, k));
    }
}
