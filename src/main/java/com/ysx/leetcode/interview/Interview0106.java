/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.interview;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/16 22:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 01.06. 字符串压缩
 * https://leetcode-cn.com/problems/compress-string-lcci/
 */
public class Interview0106 {
    public String compressString(String S) {
        if (S == null || S.length() <= 1) {
            return S;
        }
        char[] charArray = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; ) {
            int num = 1;
            int j;
            for (j = i + 1; j < charArray.length; j++) {
                if (charArray[i] != charArray[j]) {
                    break;
                }
                num++;
            }
            sb.append(charArray[i]).append(num);
            i = j;
        }
        if (S.length() <= sb.length()) {
            return S;
        } else {
            return sb.toString();
        }
    }
}
