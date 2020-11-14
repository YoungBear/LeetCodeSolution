/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/14 23:52
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1122. 数组的相对排序
 * https://leetcode-cn.com/problems/relative-sort-array/
 */
public class LeetCode1122 {
    /**
     * 朴素解法：双层循环
     * 时间复杂度为 O(arr1.length)*O(arr2.length)
     * 空间复杂度为 O(arr1.length)
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        boolean[] flag = new boolean[arr1.length];
        int[] result = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (flag[j]) {
                    continue;
                }
                if (arr2[i] == arr1[j]) {
                    flag[j] = true;
                    result[k] = arr1[j];
                    k++;
                }
            }
        }
        int[] left = new int[arr1.length - k];
        for (int j = 0, i = 0; j < arr1.length; j++) {
            if (!flag[j]) {
                flag[j] = true;
                left[i++] = arr1[j];
            }
        }
        Arrays.sort(left);
        for (int i = 0; i < left.length; i++) {
            result[k++] = left[i];
        }
        return result;
    }
}
