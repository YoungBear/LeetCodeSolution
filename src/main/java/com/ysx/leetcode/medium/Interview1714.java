/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/30 23:56
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 17.14. 最小K个数
 * https://leetcode-cn.com/problems/smallest-k-lcci/
 * 排序
 */
public class Interview1714 {
    /**
     * 冒泡排序
     * 时间复杂度为O(n*k)
     * 超时
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] smallestK(int[] arr, int k) {
        if (k == 0 || arr == null || arr.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < k; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return Arrays.copyOfRange(arr, 0, k);
    }
}
