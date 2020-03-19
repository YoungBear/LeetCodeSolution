package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/19 20:22
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 409. 最长回文串
 * https://leetcode-cn.com/problems/longest-palindrome/
 */
public class LeetCode409 {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int left = 0;
        int num = 0;
        for (int c : count) {
            if (c % 2 == 1) {
                num += c - 1;
                left = 1;
            } else {
                num += c;
            }
        }
        return num + left;
    }
}
