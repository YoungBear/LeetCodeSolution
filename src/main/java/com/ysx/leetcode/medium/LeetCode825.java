/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/7 22:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 825. 适龄的朋友
 * 825. 适龄的朋友
 * 当满足以下条件时，A 不能给 B（A、B不为同一人）发送好友请求：
 * <p>
 * age[B] <= 0.5 * age[A] + 7
 * age[B] > age[A]
 * age[B] > 100 && age[A] < 100
 */
public class LeetCode825 {
    /**
     * 双重循环，超时
     * 使用map记录相同年龄的个数
     * 执行用时 :22 ms, 在所有 Java 提交中击败了14.17%的用户
     * 内存消耗 :42.4 MB, 在所有 Java 提交中击败了11.11%的用户
     *
     * @param ages
     * @return
     */
    public int numFriendRequests(int[] ages) {
        int result = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int age : ages) {
            countMap.put(age, countMap.getOrDefault(age, 0) + 1);
        }
        for (int key1 : countMap.keySet()) {
            for (int key2 : countMap.keySet()) {
                if (canSend(key1, key2)) {
                    if (key1 == key2) {
                        result += countMap.get(key1) * (countMap.get(key2) - 1);
                    } else {
                        result += countMap.get(key1) * countMap.get(key2);
                    }
                }
            }
        }
        return result;
    }

    private boolean canSend(int ageA, int ageB) {
        if (ageB <= (0.5 * ageA + 7)) {
            return false;
        }
        if (ageB > 100 && ageA < 100) {
            return false;
        }
        if (ageB > ageA) {
            return false;
        }
        return true;
    }
}
