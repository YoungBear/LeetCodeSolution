package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/2 13:26
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description https://leetcode-cn.com/problems/missing-number-in-arithmetic-progression/
 * 需要注意等差数列的差为0的情况
 */
public class LeetCode1228 {

    public int missingNumber(int[] arr) {
        int delta = (arr[arr.length - 1] - arr[0]) / arr.length;
        if (0 == delta) {
            return arr[0];
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0] + i * delta) {
                return arr[0] + i * delta;
            }
        }
        throw new RuntimeException("no such answer.");
    }
}
