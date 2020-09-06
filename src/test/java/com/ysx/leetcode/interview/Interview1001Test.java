/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.interview;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/3 21:32
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview1001Test {
    @Test
    public void test1() {
        Interview1001 interview1001 = new Interview1001();
        int[] A = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] B = {2, 5, 6};
        int n = 3;
        interview1001.merge(A, m, B, n);
        int[] excepted = {1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(excepted, A);
    }
}
