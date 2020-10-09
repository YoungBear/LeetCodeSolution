/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/10/9 22:14
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 374. 猜数字大小
 */
public class LeetCode374 extends GuessGame {
    public int guessNumber(int n) {
        int begin = 1;
        int end = n;
        while (begin <= end) {
            int middle = begin + (end - begin) / 2;
            int guess = guess(middle);
            if (0 == guess) {
                return middle;
            } else if (-1 == guess) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        return -1;
    }
}

class GuessGame {
    int guess(int num) {
        return 0;
    }
}

