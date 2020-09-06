/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/23 7:22
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1446. 连续字符
 * https://leetcode-cn.com/problems/consecutive-characters/
 */
public class LeetCode1446 {
    public int maxPower(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int max = 1;
        int currentMax = 1;
        char currentChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                currentMax++;
            } else {
                max = Math.max(max, currentMax);
                currentChar = s.charAt(i);
                currentMax = 1;
            }
        }
        max = Math.max(max, currentMax);
        return max;
    }
}
