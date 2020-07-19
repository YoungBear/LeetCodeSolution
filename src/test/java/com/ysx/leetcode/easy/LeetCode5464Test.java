package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/19 21:46
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode5464Test {
    @Test
    public void test1() {
        LeetCode5464 leetCode5464 = new LeetCode5464();
        int numBottles = 9;
        int numExchange = 3;
        int excepted = 13;
        Assert.assertEquals(excepted, leetCode5464.numWaterBottles(numBottles, numExchange));
    }

    @Test
    public void test2() {
        LeetCode5464 leetCode5464 = new LeetCode5464();
        int numBottles = 15;
        int numExchange = 4;
        int excepted = 19;
        Assert.assertEquals(excepted, leetCode5464.numWaterBottles(numBottles, numExchange));
    }

    @Test
    public void test3() {
        LeetCode5464 leetCode5464 = new LeetCode5464();
        int numBottles = 5;
        int numExchange = 5;
        int excepted = 6;
        Assert.assertEquals(excepted, leetCode5464.numWaterBottles(numBottles, numExchange));
    }

    @Test
    public void test4() {
        LeetCode5464 leetCode5464 = new LeetCode5464();
        int numBottles = 2;
        int numExchange = 3;
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode5464.numWaterBottles(numBottles, numExchange));
    }
}
