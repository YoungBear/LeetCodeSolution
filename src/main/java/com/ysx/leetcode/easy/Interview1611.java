/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/7/8 21:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题 16.11. 跳水板
 * https://leetcode-cn.com/problems/diving-board-lcci/
 */
public class Interview1611 {

    /**
     * 使用数组
     *
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public int[] divingBoard(int shorter, int longer, int k) {
        if (0 == k) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] result = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {
            result[i] = shorter * (k - i) + longer * i;
        }
        return result;
    }

    /**
     * 使用 set 超时
     *
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public int[] divingBoard1(int shorter, int longer, int k) {
        if (0 == k) {
            return new int[0];
        }
        Set<Integer> set = new HashSet<>();
        set.add(shorter);
        set.add(longer);
        for (int i = 1; i < k; i++) {
            Set<Integer> tempSet = new HashSet<>();
            for (int num : set) {
                tempSet.add(num + shorter);
                tempSet.add(num + longer);
            }
            set.clear();
            set.addAll(tempSet);
        }
        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
