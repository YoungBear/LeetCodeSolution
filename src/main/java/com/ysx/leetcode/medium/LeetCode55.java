/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/23 23:29
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 55. 跳跃游戏
 * https://leetcode-cn.com/problems/jump-game/
 * <p>
 * 贪心算法
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 判断你是否能够到达最后一个位置。
 */
public class LeetCode55 {
    /**
     * 贪心算法
     * rightMost表示当前可以到达的最右侧的点
     * 对于当前点i，如果i<=rightMost，则也可以到达i点，所以可以以i点为基础，找到下一个可以到达的最右侧的低啊
     * 即rightMost=max(rightMost, i+nums[i])
     * 初始点：rightMost=0
     * 结束点：rightMost >= nums.length-1
     *
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int rigthMost = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= rigthMost) {
                rigthMost = Math.max(rigthMost, i + nums[i]);
                if (rigthMost >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 如果位置i可以到达，则从i+1 到i+nums[i]也可达
     * 循环整个nums，对于每一个位置分别做这个动作，记录当前可以到达的最大的点
     * 初始值可达的点的下标为0
     * 如果当前点i大于当前最大可达点p，则说明当前点i不可达，且其后的所有点皆不可达，返回false
     * 如果可以循环结束，则说明最后一个点可达，返回true
     *
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {
        // 可达的点的下标
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > p) {
                return false;
            }
            p = Math.max(p, i + nums[i]);
        }
        return true;
    }
}
