/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.interview;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/10 22:09
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview64Test {
    @Test
    public void test1() {
        Interview64 interview64 = new Interview64();
        Assert.assertEquals(1, interview64.sumNums(1));
        Assert.assertEquals(3, interview64.sumNums(2));
        Assert.assertEquals(55, interview64.sumNums(10));
    }
}
