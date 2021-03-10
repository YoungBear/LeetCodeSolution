/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.advanced;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/3/10 23:43
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode878Test {
    @Test
    public void test1() {
        LeetCode878 leetCode878 = new LeetCode878();
        int N = 1, A = 2, B = 3;
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode878.nthMagicalNumber(N, A, B));
    }

    @Test
    public void test2() {
        LeetCode878 leetCode878 = new LeetCode878();
        int N = 4, A = 2, B = 3;
        int excepted = 6;
        Assert.assertEquals(excepted, leetCode878.nthMagicalNumber(N, A, B));
    }

    @Test
    public void test3() {
        LeetCode878 leetCode878 = new LeetCode878();
        int N = 5, A = 2, B = 4;
        int excepted = 10;
        Assert.assertEquals(excepted, leetCode878.nthMagicalNumber(N, A, B));
    }

    @Test
    public void test4() {
        LeetCode878 leetCode878 = new LeetCode878();
        int N = 3, A = 6, B = 4;
        int excepted = 8;
        Assert.assertEquals(excepted, leetCode878.nthMagicalNumber(N, A, B));
    }
}
