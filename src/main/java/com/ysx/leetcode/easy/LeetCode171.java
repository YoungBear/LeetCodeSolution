/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/29 23:02
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 171. Excel表列序号
 */
public class LeetCode171 {
    /**
     * 类似于26进制
     *
     * @param columnTitle 列名称
     * @return 列序号
     */
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int n = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char ch = columnTitle.charAt(i);
            result += (ch - 'A' + 1) * n;
            n = n * 26;
        }
        return result;
    }
}
