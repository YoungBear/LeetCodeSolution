/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/26 21:23
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1002. 查找常用字符
 * https://leetcode-cn.com/problems/find-common-characters/
 */
public class LeetCode1002 {
    public List<String> commonChars(String[] A) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : A[0].toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 1; i < A.length; i++) {
            Map<Character, Integer> tempMap = new HashMap<>();
            for (char ch : A[i].toCharArray()) {
                tempMap.put(ch, tempMap.getOrDefault(ch, 0) + 1);
            }
            for (char ch : map.keySet()) {
                if (tempMap.containsKey(ch)) {
                    map.put(ch, Math.min(map.get(ch), tempMap.get(ch)));
                } else {
                    map.put(ch, 0);
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (char ch : map.keySet()) {
            for (int i = 0; i < map.get(ch); i++) {
                result.add(String.valueOf(ch));
            }
        }
        return result;
    }
}
