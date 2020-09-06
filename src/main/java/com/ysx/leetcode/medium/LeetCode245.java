/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/8 22:06
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 245. 最短单词距离 III
 * https://leetcode-cn.com/problems/shortest-word-distance-iii/
 * <p>
 * 给定一个单词列表和两个单词 word1 和 word2，返回列表中这两个单词之间的最短距离。
 * <p>
 * word1 和 word2 是有可能相同的，并且它们将分别表示为列表中两个独立的单词。
 * <p>
 * 示例:
 * 假设 words = ["practice", "makes", "perfect", "coding", "makes"].
 * <p>
 * 输入: word1 = “makes”, word2 = “coding”
 * 输出: 1
 * 输入: word1 = "makes", word2 = "makes"
 * 输出: 3
 * 注意:
 * 你可以假设 word1 和 word2 都在列表里。
 */
public class LeetCode245 {

    /**
     * 调用 243 的解法，分word1和word2是否相等两种情况
     *
     * 执行用时 :1 ms, 在所有 Java 提交中击败了100.00%的用户
     *
     * 内存消耗 :36.4 MB, 在所有 Java 提交中击败了100.00%的用户
     *
     * @param words
     * @param word1
     * @param word2
     * @return
     */
    public int shortestWordDistance(String[] words, String word1, String word2) {
        if (word1.equals(word2)) {
            int distance = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < words.length; i++) {
                if (word1.equals(words[i])) {
                    if (-1 != index) {
                        distance = Math.min(distance, i - index);
                        if (1 == distance) {
                            return distance;
                        }
                    }
                    index = i;
                }
            }
            return distance;
        } else {
            return shortestWordDistance243(words, word1, word2);
        }
    }

    public int shortestWordDistance243(String[] words, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (word1.equals(words[i])) {
                index1 = i;
            } else if (word2.equals(words[i])) {
                index2 = i;
            }
            if (-1 != index1 && -1 != index2) {
                distance = Math.min(distance, Math.abs(index1 - index2));
            }
        }
        return distance;
    }
}
