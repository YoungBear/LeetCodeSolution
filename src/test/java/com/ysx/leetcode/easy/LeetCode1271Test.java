package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/7 21:56
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1271Test {

    @Test
    public void toHexspeakTest() {
        LeetCode1271 demo = new LeetCode1271();

        Assert.assertEquals("IOI", demo.toHexspeak("257"));
        Assert.assertEquals("ERROR", demo.toHexspeak("3"));
    }
}
