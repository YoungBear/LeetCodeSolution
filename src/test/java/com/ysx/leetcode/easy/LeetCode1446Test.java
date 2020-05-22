package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/23 7:23
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1446Test {
    @Test
    public void test1() {
        LeetCode1446 leetCode1446 = new LeetCode1446();
        String s = "leetcode";
        int excepted = 2;
        Assert.assertEquals(excepted, leetCode1446.maxPower(s));
    }

    @Test
    public void test2() {
        LeetCode1446 leetCode1446 = new LeetCode1446();
        String s = "abbcccddddeeeeedcba";
        int excepted = 5;
        Assert.assertEquals(excepted, leetCode1446.maxPower(s));
    }

    @Test
    public void test3() {
        LeetCode1446 leetCode1446 = new LeetCode1446();
        String s = "triplepillooooow";
        int excepted = 5;
        Assert.assertEquals(excepted, leetCode1446.maxPower(s));
    }

    @Test
    public void test4() {
        LeetCode1446 leetCode1446 = new LeetCode1446();
        String s = "hooraaaaaaaaaaay";
        int excepted = 11;
        Assert.assertEquals(excepted, leetCode1446.maxPower(s));
    }

    @Test
    public void test5() {
        LeetCode1446 leetCode1446 = new LeetCode1446();
        String s = "tourist";
        int excepted = 1;
        Assert.assertEquals(excepted, leetCode1446.maxPower(s));
    }

    @Test
    public void test6() {
        LeetCode1446 leetCode1446 = new LeetCode1446();
        String s = "111";
        int excepted = 3;
        Assert.assertEquals(excepted, leetCode1446.maxPower(s));
    }
}
