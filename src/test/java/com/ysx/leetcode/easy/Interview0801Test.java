package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/26 9:49
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview0801Test {
    @Test
    public void test1() {
        Interview0801 interview0801 = new Interview0801();
        int n = 3;
        int excepted = 4;
        Assert.assertEquals(excepted, interview0801.waysToStep(n));
    }

    @Test
    public void test2() {
        Interview0801 interview0801 = new Interview0801();
        int n = 5;
        int excepted = 13;
        Assert.assertEquals(excepted, interview0801.waysToStep(n));
    }
}
