/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/15 20:48
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1071. 字符串的最大公因子
 * https://leetcode-cn.com/problems/greatest-common-divisor-of-strings/
 */
public class LeetCode1071 {
    public String gcdOfStrings(String str1, String str2) {
        String result = "";
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            String factor = str1.substring(0, i + 1);
            if (isFactor(str1, factor) && isFactor(str2, factor)) {
                result = factor;
            }
        }
        return result;
    }

    /**
     * 判断factor是否为str的因子
     * factor和str长度都大于0
     *
     * @param str
     * @param factor
     * @return
     */
    public boolean isFactor(String str, String factor) {
        int strLength = str.length();
        int factorLength = factor.length();
        int n = strLength / factorLength;
        if (n * factorLength != strLength) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < factorLength; j++) {
                if (factor.charAt(j) != str.charAt(i * factorLength + j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
