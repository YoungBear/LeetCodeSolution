package com.ysx.leetcode.interview;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/4 22:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview0102Test {
    @Test
    public void CheckPermutationTest1() {
        Interview0102 interview0102 = new Interview0102();
        String s1 = "abc";
        String s2 = "bca";
        Assert.assertTrue(interview0102.CheckPermutation(s1, s2));
    }

    @Test
    public void CheckPermutationTest2() {
        Interview0102 interview0102 = new Interview0102();
        String s1 = "abc";
        String s2 = "bad";
        Assert.assertFalse(interview0102.CheckPermutation(s1, s2));
    }
}
