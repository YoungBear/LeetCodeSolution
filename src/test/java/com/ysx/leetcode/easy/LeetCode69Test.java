package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/7 10:34
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode69Test {
    private LeetCode69 leetCode69;

    @Before
    public void init() {
        leetCode69 = new LeetCode69();
    }

    @Test
    public void test1() {
        Assert.assertEquals(0, leetCode69.mySqrt(0));
        Assert.assertEquals(1, leetCode69.mySqrt(1));
        Assert.assertEquals(2, leetCode69.mySqrt(4));
        Assert.assertEquals(2, leetCode69.mySqrt(8));

    }
}
