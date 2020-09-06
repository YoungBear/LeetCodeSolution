/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.Arrays;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/14 21:54
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 16. 最接近的三数之和
 * https://leetcode-cn.com/problems/3sum-closest/
 */
public class LeetCode16 {
    /**
     * 参考 15，先排序，使用双指针
     * 优化的双指针，先判断区间内的最大值 rangeMax 和最小值 rangeMin 与 target 的大小
     * 如果 rangeMax < target 或者 rangeMin > target，则该区间不必再循环了
     * 时间复杂度为O(n*n)，空间复杂度为O(1)
     * <p>
     * 执行用时 :2 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗 :37 MB, 在所有 Java 提交中击败了82.68%的用户
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        // 先排序
        Arrays.sort(nums);
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            // 不遍历重复元素
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;

            // 区间[left,right]内,和最小的值
            int rangeMin = nums[i] + nums[left] + nums[left + 1];
            // 区间[left,right]内,和最大的值
            int rangeMax = nums[i] + nums[right] + nums[right - 1];
            if (rangeMin > target) {
                // 区间最小值比目标大, 没必要寻找区间其他值的和了
                if (rangeMin - target < min) {
                    min = rangeMin - target;
                    minSum = rangeMin;
                }
            } else if (rangeMax < target) {
                // 区间最大的值比目标还要小,也没必要寻找区间其他值的和了
                if (target - rangeMax < min) {
                    min = target - rangeMax;
                    minSum = rangeMax;
                }
            } else {
                // 双指针
                while (left < right) {
                    int diff = nums[i] + nums[left] + nums[right] - target;
                    if (Math.abs(diff) < min) {
                        min = Math.abs(diff);
                        minSum = nums[i] + nums[left] + nums[right];
                    }
                    if (diff == 0) {
                        // diff 为 0，找到答案
                        return minSum;
                    } else if (diff > 0) {
                        // diff 大于 0，移动右指针
                        right--;
                    } else {
                        // diff 小于 0，移动左指针
                        left++;
                    }
                }
            }
        }
        return minSum;
    }
}
