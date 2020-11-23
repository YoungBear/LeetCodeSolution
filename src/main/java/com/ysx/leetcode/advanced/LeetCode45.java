/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.advanced;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/24 0:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 45. 跳跃游戏 II
 * <p>
 * 贪心算法
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * <p>
 */
public class LeetCode45 {
    /**
     * 贪心
     * 每次选择可以到达终点的最左侧的数，然后以当前数为终点，计算前一个数
     * 时间复杂度O(n*n)
     * 空间复杂度O(1)
     *
     * @param nums
     * @return
     */
    public int jump2(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }

    /**
     * 贪心
     * 我们每次在可跳范围内选择可以使得跳的更远的位置
     * 用 end 表示当前能跳的边界
     *
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            // 找能跳的最远的
            maxPosition = Math.max(maxPosition, i + nums[i]);
            // 遇到边界，就更新边界，并且步数加一
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

}
