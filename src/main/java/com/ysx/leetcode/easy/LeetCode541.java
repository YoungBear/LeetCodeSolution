/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/7 21:49
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 541. 反转字符串 II
 * https://leetcode-cn.com/problems/reverse-string-ii/
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 */
public class LeetCode541 {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2 * k) {
            // 判断剩余字符是否大于k
            if (i + k < s.length()) {
                // 反转前k个字符
                for (int j = 0; j < k; j++) {
                    sb.append(s.charAt(i + k - j - 1));
                }
                // 剩余字符保持原样
                for (int j = 0; j < k && i + k + j < s.length(); j++) {
                    sb.append(s.charAt(i + k + j));
                }
            } else {
                for (int j = 0; i + j < s.length(); j++) {
                    sb.append(s.charAt(s.length() - 1 - j));
                }
            }
        }
        return sb.toString();
    }
}
