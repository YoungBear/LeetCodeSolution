/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/6 15:10
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode997Test {
    @Test
    public void test1() {
        LeetCode997 leetCode997 = new LeetCode997();
        int N = 2;
        int[][] trust = {{1, 2}};
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode997.findJudge(N, trust));
    }

    @Test
    public void test2() {
        LeetCode997 leetCode997 = new LeetCode997();
        int N = 3;
        int[][] trust = {{1, 3}, {2, 3}};
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode997.findJudge(N, trust));
    }

    @Test
    public void test3() {
        LeetCode997 leetCode997 = new LeetCode997();
        int N = 3;
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};
        int excepted = -1;
        Assert.assertEquals(excepted, leetCode997.findJudge(N, trust));
    }

    @Test
    public void test4() {
        LeetCode997 leetCode997 = new LeetCode997();
        int N = 3;
        int[][] trust = {{1, 2}, {2, 3}};
        int excepted = -1;
        Assert.assertEquals(excepted, leetCode997.findJudge(N, trust));
    }

    @Test
    public void test5() {
        LeetCode997 leetCode997 = new LeetCode997();
        int N = 4;
        int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode997.findJudge(N, trust));
    }
}
