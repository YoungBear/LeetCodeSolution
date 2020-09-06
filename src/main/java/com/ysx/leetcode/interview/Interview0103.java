/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.interview;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/11 22:07
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 01.03. URL化
 * https://leetcode-cn.com/problems/string-to-url-lcci/
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 */
public class Interview0103 {
    public String replaceSpaces(String S, int length) {
        // 空格的个数
        int count = 0;
        // 其他字符的个数
        int others = 0;
        for (int i = 0; i < length; i++) {
            if (' ' == S.charAt(i)) {
                count++;
            } else {
                others++;
            }
        }
        int arrayLength = others + 3 * count;
        char[] array = new char[arrayLength];
        for (int i = 0, j = 0; i < length; i++) {
            if (' ' == S.charAt(i)) {
                array[j++] = '%';
                array[j++] = '2';
                array[j++] = '0';
            } else {
                array[j++] = S.charAt(i);
            }
        }
        return String.valueOf(array);
    }
}
