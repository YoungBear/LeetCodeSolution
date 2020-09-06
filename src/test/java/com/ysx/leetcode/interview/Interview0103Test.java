/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.interview;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/11 22:08
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Interview0103Test {
    @Test
    public void test1() {
        Interview0103 interview0103 = new Interview0103();
        String S = "Mr John Smith    ";
        int length = 13;
        String excepted = "Mr%20John%20Smith";
        Assert.assertEquals(excepted, interview0103.replaceSpaces(S, length));
    }

    @Test
    public void test2() {
        Interview0103 interview0103 = new Interview0103();
        String S = "               ";
        int length = 5;
        String excepted = "%20%20%20%20%20";
        Assert.assertEquals(excepted, interview0103.replaceSpaces(S, length));
    }
}
