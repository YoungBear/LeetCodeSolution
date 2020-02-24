package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/24 19:22
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode415Test {
    private LeetCode415 leetCode415;

    @Before
    public void init() {
        leetCode415 = new LeetCode415();
    }

    @Test
    public void test1() {
        String num1 = "123";
        String num2 = "456";
        String sum = leetCode415.addStrings(num1, num2);
        Assert.assertEquals("579", sum);
    }

    @Test
    public void test2() {
        String num1 = "0";
        String num2 = "0";
        String sum = leetCode415.addStrings(num1, num2);
        Assert.assertEquals("0", sum);
    }

    @Test
    public void test3() {
        String num1 = "0";
        String num2 = "99";
        String sum = leetCode415.addStrings(num1, num2);
        Assert.assertEquals("99", sum);
    }

    @Test
    public void test4() {
        String num1 = "1";
        String num2 = "99";
        String sum = leetCode415.addStrings(num1, num2);
        Assert.assertEquals("100", sum);
    }

    @Test
    public void test5() {
        String num1 = "199";
        String num2 = "99";
        String sum = leetCode415.addStrings(num1, num2);
        Assert.assertEquals("298", sum);
    }

    @Test
    public void test6() {
        String num1 = "199";
        String num2 = "9";
        String sum = leetCode415.addStrings(num1, num2);
        Assert.assertEquals("208", sum);
    }
}
