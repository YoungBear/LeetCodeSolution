/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/15 18:20
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 922. 按奇偶排序数组 II
 * https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 */
public class LeetCode922 {
    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int i = 0;
        int j = 1;
        for (int k = 0; k < A.length; k++) {
            if (A[k] % 2 == 0) {
                result[i] = A[k];
                i += 2;
            } else {
                result[j] = A[k];
                j += 2;
            }
        }
        return result;
    }
}
