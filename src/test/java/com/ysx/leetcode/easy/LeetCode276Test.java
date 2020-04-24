package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/24 21:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode276Test {
    @Test
    public void test1() {
        LeetCode276 leetCode276 = new LeetCode276();
        int n = 3;
        int k = 2;
        int excepted = 6;
        Assert.assertEquals(excepted, leetCode276.numWaysOptimize(n, k));
    }
}
