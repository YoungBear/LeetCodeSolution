/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.advanced;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/6 22:34
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 829. 连续整数求和
 * https://leetcode-cn.com/problems/consecutive-numbers-sum/
 */
public class LeetCode829 {
    public int consecutiveNumbersSum(int N) {
        int num = 0;
        for (int k = (int) Math.sqrt(2 * N); k >= 1; k--) {
            int a0 = (2 * N / k - k + 1) / 2;
            if (a0 <= 0) {
                // 不考虑0或者负数
                continue;
            }
            if (N == ((k * k + 2 * a0 * k - k) / 2)) {
                num++;
            }
        }
        return num;
    }
}
