package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/19 20:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 266. 回文排列
 * https://leetcode-cn.com/problems/palindrome-permutation/
 */
public class LeetCode266 {
    public boolean canPermutePalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int odd = 0;
        for (int c : count) {
            if (c % 2 == 1) {
                odd += 1;
                if (odd >= 2) {
                    return false;
                }
            }
        }
        return true;
    }
}
