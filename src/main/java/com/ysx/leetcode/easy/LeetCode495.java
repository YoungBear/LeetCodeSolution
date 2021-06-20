/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/6/20 18:37
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * 495. 提莫攻击
 * https://leetcode-cn.com/problems/teemo-attacking/
 */
public class LeetCode495 {

    /**
     * @param timeSeries 攻击的时间点
     * @param duration   中毒时间
     * @return 中毒总时长
     */
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            // 每次新增的时长，为中毒时长与间隔时长的较小值
            sum += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        sum += duration;
        return sum;
    }
}
