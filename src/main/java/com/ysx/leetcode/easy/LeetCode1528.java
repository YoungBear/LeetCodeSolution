/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/30 22:38
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1528. 重新排列字符串
 * https://leetcode-cn.com/problems/shuffle-string/
 */
public class LeetCode1528 {
    public String restoreString(String s, int[] indices) {
        char[] array = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            array[indices[i]] = s.charAt(i);
        }
        return new String(array);
    }
}
