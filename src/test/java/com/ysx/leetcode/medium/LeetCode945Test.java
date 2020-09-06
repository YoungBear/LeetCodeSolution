/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/22 9:17
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode945Test {
    @Test
    public void test1() {
        LeetCode945 leetCode945 = new LeetCode945();
        int[] A = {1, 2, 2};
        int excepted = 1;
        Assert.assertEquals(excepted, leetCode945.minIncrementForUnique(A));
    }

    @Test
    public void test2() {
        LeetCode945 leetCode945 = new LeetCode945();
        int[] A = {3, 2, 1, 2, 1, 7};
        int excepted = 6;
        Assert.assertEquals(excepted, leetCode945.minIncrementForUnique(A));
    }
}
