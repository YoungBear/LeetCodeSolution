package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/7 12:37
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode633Test {
    @Test
    public void test() {
        LeetCode633 leetCode633 = new LeetCode633();
        Assert.assertTrue(leetCode633.judgeSquareSum(5));
        Assert.assertFalse(leetCode633.judgeSquareSum(3));
    }
}
