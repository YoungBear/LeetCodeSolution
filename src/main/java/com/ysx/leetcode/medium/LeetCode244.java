package com.ysx.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/8 21:45
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 244. 最短单词距离 II
 * https://leetcode-cn.com/problems/shortest-word-distance-ii/
 */
public class LeetCode244 {
    /**
     * 用map来保存单词和下标列表
     */
    private Map<String, List<Integer>> indexMap;

    public LeetCode244(String[] words) {
        indexMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            List<Integer> indexList =
                    indexMap.computeIfAbsent(words[i], k -> new ArrayList<>());
            indexList.add(i);
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> index1List = indexMap.get(word1);
        List<Integer> index2List = indexMap.get(word2);
        int distance = Integer.MAX_VALUE;
        for (int index1 : index1List) {
            for (int index2 : index2List) {
                distance = Math.min(distance, Math.abs(index1 - index2));
            }
        }
        return distance;
    }
}
