package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/27 21:10
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1119Test {
    @Test
    public void test1() {
        LeetCode1119 leetCode1119 = new LeetCode1119();
        String S = "leetcodeisacommunityforcoders";
        String excepted = "ltcdscmmntyfrcdrs";
        String result = leetCode1119.removeVowels(S);
        Assert.assertEquals(excepted, result);
    }

    @Test
    public void test2() {
        LeetCode1119 leetCode1119 = new LeetCode1119();
        String S = "aeiou";
        String excepted = "";
        String result = leetCode1119.removeVowels(S);
        Assert.assertEquals(excepted, result);
    }

}
