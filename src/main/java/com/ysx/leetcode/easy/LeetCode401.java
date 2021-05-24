/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/5/24 23:06
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 401. 二进制手表
 */
public class LeetCode401 {
    private static final int[] HOURS = new int[]{1, 2, 4, 8, 0, 0, 0, 0, 0, 0};
    private static final int[] MINUTES = new int[]{0, 0, 0, 0, 1, 2, 4, 8, 16, 32};

    /**
     * 401. 二进制手表
     *
     * @param num 亮灯的数量
     * @return 时间数组
     */
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        backtrack(res, num, 0, 0, 0);
        return res;
    }

    /**
     * 递归获取满足条件的时间点
     *
     * @param num    剩余需要点亮的灯数量
     * @param index  从索引index开始往后点亮灯
     * @param hour   当前小时数
     * @param minute 当前分钟数
     */
    public void backtrack(List<String> res, int num, int index, int hour, int minute) {
        if (hour > 11 || minute > 59) {
            return;
        }
        if (num == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(hour).append(":");
            if (minute < 10) {
                sb.append("0");
            }
            sb.append(minute);
            res.add(sb.toString());
            return;
        }
        for (int i = index; i < 10; i++) {
            backtrack(res, num - 1, i + 1, hour + HOURS[i], minute + MINUTES[i]);
        }
    }
}
