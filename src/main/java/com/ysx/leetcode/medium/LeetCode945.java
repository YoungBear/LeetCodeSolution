/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/22 9:16
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 945. 使数组唯一的最小增量
 * https://leetcode-cn.com/problems/minimum-increment-to-make-array-unique/
 */
public class LeetCode945 {

    /**
     * 排序，与前一个数相比
     * 时间复杂度为 O(NlogN)
     * 空间复杂度为 O(1)
     *
     * @param A
     * @return
     */
    public int minIncrementForUnique(int[] A) {
        // 先排序，再遍历每一个数，如果 A[i] <= A[i-1]，则设置 A[i] = A[i-1] + 1
        Arrays.sort(A);
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                count += A[i - 1] + 1 - A[i];
                A[i] = A[i - 1] + 1;
            }
        }
        return count;
    }

    /**
     * 使用map存储个数，超时
     *
     * @param A
     * @return
     */
    public int minIncrementForUnique2(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int count = 0;
        for (int a : A) {
            if (map.get(a) > 1) {
                map.put(a, map.get(a) - 1);
                int i = a;
                while (map.containsKey(i)) {
                    i++;
                    count++;
                }
                map.put(i, 1);
            }
        }
        return count;
    }
}
