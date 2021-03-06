/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/8/23 09:59
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 5479. 千位分隔数
 * https://leetcode-cn.com/problems/thousand-separator/
 */
public class LeetCode5479 {
    private static final String SEPARATOR = ".";

    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1, j = 1; i >= 0; i--, j++) {
            sb.append(s.charAt(i));
            if (i != 0 && j % 3 == 0) {
                sb.append(SEPARATOR);
            }
        }
        return sb.reverse().toString();
    }

    public String thousandSeparator2(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        if (s.length() <= 3) {
            return s;
        }
        int size = s.length() / 3;
        int start = 0;
        int next = s.length() % 3;
        if (next == 0) {
            next = 3;
        } else {
            size++;
        }
        for (int i = 0; i < size; i++) {
            sb.append(s, start, next).append(SEPARATOR);
            start = next;
            next += 3;
        }
        return sb.substring(0, sb.length() - 1);
    }
}
