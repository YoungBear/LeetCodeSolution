package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/5 21:46
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode201Test {

    private LeetCode201 instance;

    @Before
    public void init(){
        instance = new LeetCode201();
    }

    @Test
    public void rangeBitwiseAndTest() {
        Assert.assertEquals(4, instance.rangeBitwiseAnd(5,7));
        Assert.assertEquals(0, instance.rangeBitwiseAnd(0,1));

    }
}
