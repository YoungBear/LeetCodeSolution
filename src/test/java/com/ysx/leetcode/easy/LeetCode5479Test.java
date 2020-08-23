package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/8/23 10:01
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode5479Test {
    @Test
    public void test1() {
        LeetCode5479 leetCode5479 = new LeetCode5479();
        Assert.assertEquals("987", leetCode5479.thousandSeparator(987));
        Assert.assertEquals("1.234", leetCode5479.thousandSeparator(1234));
        Assert.assertEquals("123.456.789", leetCode5479.thousandSeparator(123456789));
        Assert.assertEquals("0", leetCode5479.thousandSeparator(0));
    }
}
