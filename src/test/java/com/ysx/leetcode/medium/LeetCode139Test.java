package com.ysx.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/26 08:26
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode139Test {
    @Test
    public void test1() {
        LeetCode139 leetCode139 = new LeetCode139();
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        Assert.assertTrue(leetCode139.wordBreak(s, wordDict));
    }

    @Test
    public void test2() {
        LeetCode139 leetCode139 = new LeetCode139();
        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen");
        Assert.assertTrue(leetCode139.wordBreak(s, wordDict));
    }

    @Test
    public void test3() {
        LeetCode139 leetCode139 = new LeetCode139();
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        Assert.assertFalse(leetCode139.wordBreak(s, wordDict));
    }
}
