package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/8 21:08
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode294Test {
    @Test
    public void canWinTest() {
        LeetCode294 test = new LeetCode294();
        Assert.assertTrue(test.canWin("++++"));
        Assert.assertFalse(test.canWin("+++++"));
    }
}
