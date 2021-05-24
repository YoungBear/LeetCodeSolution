/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/5/24 23:05
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 * 400. 第 N 位数字
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 位数字。
 */
public class LeetCode400 {
    /**
     * 第 N 位数字
     *
     * @param n n
     * @return 第n数字的值
     */
    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        int step = 2;
        int sum = 9;
        while (n > sum + 9 * Math.pow(10, step - 1) * step) {
            sum += 9 * Math.pow(10, step - 1) * step;
            step++;
        }
        // 当前区间的位数
        int currentN = n - sum;
        int position = currentN % step;
        // 当前区间的数
        int currentNumber = (int) (Math.pow(10, step - 1)) + currentN / step - 1 +
                (position == 0 ? 0 : 1);
        position = position == 0 ? 0 : step - position;
        return findPositionDigit(currentNumber, position);
    }

    /**
     * 获取一个数的第p位的数字，p从0开始，0代表个位，1代表十位...
     *
     * @param n
     * @param position
     * @return
     */
    public int findPositionDigit(int n, int position) {
        for (int i = 0; i < position; i++) {
            n /= 10;
        }
        return n % 10;
    }
}
