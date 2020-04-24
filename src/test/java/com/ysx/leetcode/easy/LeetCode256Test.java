package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/24 20:55
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode256Test {
    @Test
    public void test1() {
        LeetCode256 leetCode256 = new LeetCode256();
        int[][] costs = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
        int excepted = 10;
        Assert.assertEquals(excepted, leetCode256.minCost(costs));
    }
}
