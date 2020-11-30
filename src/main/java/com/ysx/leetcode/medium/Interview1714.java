/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.TreeSet;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/30 23:56
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 17.14. 最小K个数
 * https://leetcode-cn.com/problems/smallest-k-lcci/
 */
public class Interview1714 {
    public int[] smallestK(int[] arr, int k) {
        if (k == 0 || arr == null || arr.length == 0) {
            return new int[0];
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            treeSet.add(arr[i]);
            if (treeSet.size() > k) {
                treeSet.pollLast();
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = treeSet.pollFirst();
        }
        return result;
    }
}
