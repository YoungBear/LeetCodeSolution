package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/9 19:44
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LCP07Test {
    @Test
    public void test1() {
        LCP07 lcp07 = new LCP07();
        int n = 5;
        int[][] relation = {{0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}};
        int k = 3;
        int excepted = 3;
        Assert.assertEquals(excepted, lcp07.numWays(n, relation, k));
    }

    @Test
    public void test2() {
        LCP07 lcp07 = new LCP07();
        int n = 5;
        int[][] relation = {{0, 2}, {2, 1}};
        int k = 2;
        int excepted = 0;
        Assert.assertEquals(excepted, lcp07.numWays(n, relation, k));
    }
}
