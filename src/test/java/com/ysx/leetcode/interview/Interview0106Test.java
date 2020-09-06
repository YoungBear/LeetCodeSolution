/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.interview;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/16 22:19
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview0106Test {
    @Test
    public void test1() {
        String S = "aabcccccaaa";
        String excepted = "a2b1c5a3";
        Interview0106 interview0106 = new Interview0106();
        Assert.assertEquals(excepted, interview0106.compressString(S));
    }

    @Test
    public void test2() {
        String S = "abbccd";
        String excepted = "abbccd";
        Interview0106 interview0106 = new Interview0106();
        Assert.assertEquals(excepted, interview0106.compressString(S));
    }
}
