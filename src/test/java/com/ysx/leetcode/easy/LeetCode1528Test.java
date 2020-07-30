package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/30 22:38
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1528Test {
    @Test
    public void test1() {
        LeetCode1528 leetCode1528 = new LeetCode1528();
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String excepted = "leetcode";
        Assert.assertEquals(excepted, leetCode1528.restoreString(s, indices));
    }
}
