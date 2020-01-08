package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/8 21:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 243. 最短单词距离
 * https://leetcode-cn.com/problems/shortest-word-distance/
 * 给定一个单词列表和两个单词 word1 和 word2，返回列表中这两个单词之间的最短距离。
 * <p>
 * 示例:
 * 假设 words = ["practice", "makes", "perfect", "coding", "makes"]
 * <p>
 * 输入: word1 = “coding”, word2 = “practice”
 * 输出: 3
 * 输入: word1 = "makes", word2 = "coding"
 * 输出: 1
 * 注意:
 * 你可以假设 word1 不等于 word2, 并且 word1 和 word2 都在列表里。
 */
public class LeetCode243 {

    /**
     * 遍历一次，记录最近出现的word1和word2的下标
     * 执行用时 :2 ms, 在所有 Java 提交中击败了98.11%的用户
     * 内存消耗 :35.8 MB, 在所有 Java 提交中击败了100.00%的用户
     *
     * @param words
     * @param word1
     * @param word2
     * @return
     */
    public int shortestDistance(String[] words, String word1, String word2) {
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


    /**
     * 暴力法
     * 执行用时 : 3 ms, 在所有 Java 提交中击败了 41.20% 的用户
     * 内存消耗 : 36.2 MB, 在所有 Java 提交中击败了 100.00% 的用户
     *
     * @param words
     * @param word1
     * @param word2
     * @return
     */
    public int shortestDistance2(String[] words, String word1, String word2) {
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (word1.equals(words[i])) {
                for (int j = 0; j < words.length; j++) {
                    if (word2.equals(words[j])) {
                        distance = Math.min(distance, Math.abs(i - j));
                    }
                }
            }
        }
        return distance;
    }

    /**
     * 用两个列表来保存与word1和word2字符串相等的下标
     * 执行用时 : 2 ms, 在所有 Java 提交中击败了 98.11% 的用户
     * 内存消耗 : 36.8 MB, 在所有 Java 提交中击败了 100.00% 的用户
     *
     * @param words
     * @param word1
     * @param word2
     * @return
     */
    public int shortestDistance1(String[] words, String word1, String word2) {
        List<Integer> index1List = new ArrayList<>();
        List<Integer> index2List = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (word1.equals(words[i])) {
                index1List.add(i);
            } else if (word2.equals(words[i])) {
                index2List.add(i);
            }
        }
        int distance = Integer.MAX_VALUE;
        for (int index1 : index1List) {
            for (int index2 : index2List) {
                distance = Math.min(distance, Math.abs(index1 - index2));
            }
        }
        return distance;
    }
}
