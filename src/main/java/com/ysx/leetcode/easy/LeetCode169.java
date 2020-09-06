/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/15 20:52
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 169. 多数元素
 * https://leetcode-cn.com/problems/majority-element/
 */
public class LeetCode169 {
    /**
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        // 候选数
        int candidate = 0;
        // times初始为0，选定当前数为候选数
        // times遇到当前数n等于候选数时，time加1，否则减1
        // 由于众数出现测次数大于nums.length/2，最后循环完成，candidate为众数
        // 如果times为0，则需要选择当前数为候选数
        // 时间复杂度为O(N)
        int times = 0;
        for (int n : nums) {
            if (times == 0) {
                candidate = n;
            }
            times += n == candidate ? 1 : -1;
        }
        return candidate;
    }
}
