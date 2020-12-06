/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 14:31
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 560. 和为K的子数组
 * 前缀和
 * https://leetcode-cn.com/problems/subarray-sum-equals-k/
 */
public class LeetCode560 {

    /**
     * map表示前缀和为key出现的次数
     * 初始map.put(0,1)即出现0的次数为1
     * pre表示当前的前缀和
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum3(int[] nums, int k) {
        int count = 0, pre = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }


    /**
     * 前缀和
     * sum[i][j] 表示从i到j元素之和
     * 当i>j时，sum[i][j] 为0
     * 当i==j时，sum[i][j] 为nums[j]
     * 当i<j时，sum[i][j] = sum[i][j-1] + nums[j]
     * 因为sum[i][j]只与前一个元素有关系，所以可以用一个变量sum表示
     * 时间复杂度为O(n*n)
     * 空间复杂度为O(1)
     * 超出内存限制
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        if (null == nums || 0 == nums.length) {
            return 0;
        }
        int m = nums.length;

        int result = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = i; j < m; j++) {
                sum += nums[j];
                if (k == sum) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * 前缀和
     * sum[i][j] 表示从i到j元素之和
     * 当i>j时，sum[i][j] 为0
     * 当i==j时，sum[i][j] 为nums[j]
     * 当i<j时，sum[i][j] = sum[i][j-1] + nums[j]
     * 时间复杂度为O(n*n)
     * 空间复杂度为O(n*n)
     * 超出内存限制
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySumOld(int[] nums, int k) {
        if (null == nums || 0 == nums.length) {
            return 0;
        }
        int m = nums.length;
        int[][] sum = new int[m][m];
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                if (i == j) {
                    sum[i][j] = nums[i];
                } else {
                    sum[i][j] = sum[i][j - 1] + nums[j];
                }
                if (k == sum[i][j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
