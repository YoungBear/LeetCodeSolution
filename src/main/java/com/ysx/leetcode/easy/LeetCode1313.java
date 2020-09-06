/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/4 21:40
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1313. 解压缩编码列表
 * https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 */
public class LeetCode1313 {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
        int[] result = new int[size];
        for (int i = 0, j = 0; i < nums.length; i += 2) {
            Arrays.fill(result, j, j + nums[i], nums[i + 1]);
            j += nums[i];
        }
        return result;
    }
}
