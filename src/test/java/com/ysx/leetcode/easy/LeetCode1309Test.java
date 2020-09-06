/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/18 08:49
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1309Test {
    @Test
    public void freqAlphabetsTest() {
        LeetCode1309 demo = new LeetCode1309();
        String s1 = "10#11#12";
        Assert.assertEquals("jkab", demo.freqAlphabets(s1));
        String s2 = "1326#";
        Assert.assertEquals("acz", demo.freqAlphabets(s2));
        String s3 = "25#";
        Assert.assertEquals("y", demo.freqAlphabets(s3));
        String s4 = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz", demo.freqAlphabets(s4));
    }

    @Test
    public void freqAlphabets2Test() {
        LeetCode1309 demo = new LeetCode1309();
        String s1 = "10#11#12";
        Assert.assertEquals("jkab", demo.freqAlphabets2(s1));
        String s2 = "1326#";
        Assert.assertEquals("acz", demo.freqAlphabets2(s2));
        String s3 = "25#";
        Assert.assertEquals("y", demo.freqAlphabets2(s3));
        String s4 = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz", demo.freqAlphabets2(s4));
    }
}
