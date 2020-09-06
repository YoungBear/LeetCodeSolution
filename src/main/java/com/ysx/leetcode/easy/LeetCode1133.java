/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/24 22:27
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1133. 最大唯一数
 * https://leetcode-cn.com/problems/largest-unique-number/
 */
public class LeetCode1133 {
    public int largestUniqueNumber(int[] A) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int a : A) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        int result = -1;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() == 1) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
