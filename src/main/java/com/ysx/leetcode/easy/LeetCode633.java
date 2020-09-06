/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/7 12:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 633. 平方数之和
 * https://leetcode-cn.com/problems/sum-of-square-numbers/
 */
public class LeetCode633 {
    /**
     * 执行用时 :6 ms, 在所有 Java 提交中击败了32.93%的用户
     * 内存消耗 :33.3 MB, 在所有 Java 提交中击败了6.99%的用户
     *
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        double end = Math.sqrt(c) + 1;
        for (int i = 0; i < end; i++) {
            int a = (int) Math.sqrt(c - i * i);
            if (a * a == c - i * i) {
                return true;
            }
        }
        return false;
    }
}
