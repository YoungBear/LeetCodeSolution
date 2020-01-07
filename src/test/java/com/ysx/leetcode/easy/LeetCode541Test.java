package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/7 21:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode541Test {
    @Test
    public void reverseStrTest() {
        LeetCode541 demo = new LeetCode541();
        String s = "abcdefg";
        int k = 2;
        Assert.assertEquals("bacdfeg", demo.reverseStr(s, k));

        String s2 = "abcdefg";
        int k2 = 1;
        Assert.assertEquals("abcdefg", demo.reverseStr(s2, k2));

        String s3 = "abcdefg";
        int k3 = 3;
        Assert.assertEquals("cbadefg", demo.reverseStr(s3, k3));

        String s4 = "abcdefg";
        int k4 = 4;
        Assert.assertEquals("dcbaefg", demo.reverseStr(s4, k4));
    }
}
