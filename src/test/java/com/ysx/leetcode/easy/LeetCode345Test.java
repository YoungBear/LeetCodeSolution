package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/27 21:04
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode345Test {

    @Test
    public void test1() {
        LeetCode345 leetCode345 = new LeetCode345();
        String s = "hello";
        String excepted = "holle";
        String result = leetCode345.reverseVowels(s);
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void test2() {
        LeetCode345 leetCode345 = new LeetCode345();
        String s = "leetcode";
        String excepted = "leotcede";
        String result = leetCode345.reverseVowels(s);
        Assert.assertEquals(excepted, result);
    }
}
