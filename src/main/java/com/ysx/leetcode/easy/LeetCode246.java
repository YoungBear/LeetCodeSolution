/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/2 13:43
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 246. 中心对称数
 * https://leetcode-cn.com/problems/strobogrammatic-number/
 * 6 -> 9
 * 9 -> 6
 * 1 -> 1
 * 8 -> 8
 * 0 -> 0
 */
public class LeetCode246 {

    private static final Map<Character, Character> MAP = new HashMap<>();

    static {
        MAP.put('0', '0');
        MAP.put('1', '1');
        MAP.put('6', '9');
        MAP.put('8', '8');
        MAP.put('9', '6');
    }

    public boolean isStrobogrammatic(String num) {
        for (int i = 0; i < num.length() / 2 + 1; i++) {
            if (!MAP.containsKey(num.charAt(i))) {
                return false;
            }
            if (MAP.get(num.charAt(i)) != num.charAt(num.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
