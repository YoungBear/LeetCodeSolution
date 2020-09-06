/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/12 09:27
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 443. 压缩字符串
 * https://leetcode-cn.com/problems/string-compression/
 */
public class LeetCode443 {
    public int compress(char[] chars) {
        int length = chars.length;
        int cur = 0;
        for (int i = 0; i < length; i++) {
            char ch = chars[i];
            chars[cur++] = ch;
            for (int j = i + 1; j < length; j++) {
                if (ch != chars[j]) {
                    if (j == i + 1) {
                        break;
                    }
                    char[] tempChars = String.valueOf(j - i).toCharArray();
                    for (char tempChar : tempChars) {
                        chars[cur++] = tempChar;
                    }
                    i = j - 1;
                    break;
                } else {
                    // 最后一个字符
                    if (j == length - 1) {
                        char[] tempChars = String.valueOf(j - i + 1).toCharArray();
                        for (char tempChar : tempChars) {
                            chars[cur++] = tempChar;
                        }
                        i = j;
                        break;
                    }
                }
            }
        }
        return cur;
    }
}
