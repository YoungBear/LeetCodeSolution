/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/26 22:33
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 264. 丑数 II
 * 编写一个程序，找出第 n 个丑数。
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 */
public class LeetCode264 {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        // 三指针
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(ugly[i2] * 2, ugly[i3] * 3), ugly[i5] * 5);
            ugly[i] = min;
            if (ugly[i2] * 2 == min) {
                i2++;
            }
            if (ugly[i3] * 3 == min) {
                i3++;
            }
            if (ugly[i5] * 5 == min) {
                i5++;
            }
        }
        return ugly[n - 1];
    }
}
