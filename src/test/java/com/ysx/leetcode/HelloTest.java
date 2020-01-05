package com.ysx.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/5 11:39
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class HelloTest {

    private Hello hello;

    @Before
    public void init() {
        hello = new Hello();
    }

    @Test
    public void helloTest() {
        String name = "John";
        Assert.assertEquals("Hello John", hello.hello(name));
    }
}
