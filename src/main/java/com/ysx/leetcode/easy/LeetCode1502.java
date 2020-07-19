package com.ysx.leetcode.easy;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/19 22:22
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int n = arr[0] - arr[1];
        for (int i = 1; i < arr.length - 1; i++) {
            if (n != arr[i] - arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
