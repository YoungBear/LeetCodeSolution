/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/12 19:12
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1299. 将每个元素替换为右侧最大元素
 * https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class LeetCode1299 {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int max = arr[arr.length - 1];
        result[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i + 1] > max) {
                max = arr[i + 1];
            }
            result[i] = max;
        }
        return result;
    }
}
