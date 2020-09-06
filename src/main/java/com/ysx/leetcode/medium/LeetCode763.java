/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.*;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/21 8:33
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 763. 划分字母区间
 * https://leetcode-cn.com/problems/partition-labels/
 */
public class LeetCode763 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> resultList = new ArrayList<>();
        // map 表示字符最后一次出现的下标
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            lastIndexMap.put(S.charAt(i), i);
        }
        int begin = 0;
        int end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, lastIndexMap.get(S.charAt(i)));
            // 终止条件，已经遍历完了一组
            if (i == end) {
                resultList.add(i - begin + 1);
                begin = i + 1;
            }
        }
        return resultList;
    }

    public List<Integer> partitionLabels1(String S) {
        List<Integer> resultList = new ArrayList<>();
        String s = S;
        while (s.length() > 0) {
            int index = findIndex(s);
            resultList.add(index + 1);
            s = s.substring(index + 1);
        }
        return resultList;
    }

    /**
     * 找到当前符合的第一个字符串的最后侧的下标
     * 先找到第一个字符，从最右侧找到与这个字符相同的字符的下标resultIndex
     * 再从第二个字符开始，找到与第二个字符相同的字符的下标，与上一步的取最大值
     * ...
     * 终止条件：当第一个字符就没有找到相同的字符时，则该一个字符单独为一组；
     * 如果不是第一个字符，则终止条件为遍历到了resultIndex，则从0到resultIndex为一组
     *
     * @param s
     * @return
     */
    private int findIndex(String s) {
        if (s.length() == 1) {
            return 0;
        }
        int resultIndex = 0;
        Set<Character> set = new HashSet<>();
        int currentIndex = 0;
        while (true) {
            char currentChar = s.charAt(currentIndex);
            set.add(currentChar);
            int i = s.substring(currentIndex + 1).lastIndexOf(currentChar);
            if (-1 == i && resultIndex == 0) {
                break;
            } else {
                resultIndex = Math.max(resultIndex, i + currentIndex + 1);
                currentIndex++;
                while (currentIndex < resultIndex && set.contains(s.charAt(currentIndex))) {
                    currentIndex++;
                }
                if (currentIndex == resultIndex) {
                    break;
                }
            }
        }
        return resultIndex;
    }
}
