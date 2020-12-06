/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 17:13
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 * 974. 和可被 K 整除的子数组
 * 前缀和
 */
public class LeetCode974 {

    /**
     * 前缀和+哈希表
     * 时间复杂度为O(n)
     * map存储取余为key的个数
     * 参考LeetCode560
     *
     * @param nums
     * @param K
     * @return
     */
    public int subarraysDivByK(int[] nums, int K) {
        if (null == nums || K == 0) {
            return 0;
        }
        int count = 0, sum = 0;
        int[] map = new int[K];
        map[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int key = (sum % K + K) % K;
            count += map[key];
            map[key]++;
        }
        return count;
    }

    /**
     * 暴力法
     * 时间复杂度为O(n*n)
     * 超时
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraysDivByK2(int[] nums, int k) {
        if (null == nums || k == 0) {
            return 0;
        }
        int m = nums.length;
        int result = 0;

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = i; j < m; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
