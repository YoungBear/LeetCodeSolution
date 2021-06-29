/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/29 22:58
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 168. Excel表列名称
 */
public class LeetCode168 {
    /**
     * 类26进制
     *
     * @param columnNumber 列数
     * @return excel的列名
     */
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        int num = columnNumber;
        while (num > 0) {
            int index = num % 26;
            num /= 26;
            // 如果余数为0，则需要向前借一位，设置为26，即取字符Z，同时num减一
            if (index == 0) {
                index = 26;
                num--;
            }
            char ch = (char) (index - 1 + 'A');
            result.append(ch);
        }
        return result.reverse().toString();
    }
}
