/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/22 12:33
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 242. 有效的字母异位词
 * https://leetcode-cn.com/problems/valid-anagram/
 * 数组
 * 计数
 */
public class LeetCode242 {
    /**
     * 计算每个字符的个数，看是否相等
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        int[] countS = charCount(s);
        int[] countT = charCount(t);

        for (int i = 0; i < countS.length; i++) {
            if (countS[i] != countT[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 计算每个字符的个数
     *
     * @param s
     * @return
     */
    private int[] charCount(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        return count;
    }
}
