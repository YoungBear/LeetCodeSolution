package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/8 21:58
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode244Test {
    @Test
    public void leetCode244Test() {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        LeetCode244 test = new LeetCode244(words);
        Assert.assertEquals(3, test.shortest("coding", "practice"));
        Assert.assertEquals(1, test.shortest("makes", "coding"));
    }
}
