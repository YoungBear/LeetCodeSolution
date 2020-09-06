/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/11 22:21
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1013Test {
    @Test
    public void test1() {
        LeetCode1013 leetCode1013 = new LeetCode1013();
        int[] A = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        Assert.assertTrue(leetCode1013.canThreePartsEqualSum(A));
    }

    @Test
    public void test2() {
        LeetCode1013 leetCode1013 = new LeetCode1013();
        int[] A = {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
        Assert.assertFalse(leetCode1013.canThreePartsEqualSum(A));
    }

    @Test
    public void test3() {
        LeetCode1013 leetCode1013 = new LeetCode1013();
        int[] A = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
        Assert.assertTrue(leetCode1013.canThreePartsEqualSum(A));
    }

}
