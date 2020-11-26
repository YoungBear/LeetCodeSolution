/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/26 23:59
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 392. 判断子序列
 * https://leetcode-cn.com/problems/is-subsequence/
 * 贪心算法
 */
public class LeetCode392 {
    /**
     * 每次判断s的第一个字符，如果在t中存在，则替换t中该字符之前的所有字符为空串作为下一次的变量，s去除首字符为下一次的变量
     * 直到s为空串
     * 如果t中不存在s的首字符，则返回true
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        char ch = s.charAt(0);
        int index = t.indexOf(ch);
        if (index == -1) {
            return false;
        } else {
            return isSubsequence(s.substring(1), t.substring(index + 1));
        }
    }
}
