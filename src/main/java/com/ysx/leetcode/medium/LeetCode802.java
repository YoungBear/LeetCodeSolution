package com.ysx.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/28 22:25
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 820. 单词的压缩编码
 * https://leetcode-cn.com/problems/short-encoding-of-words/
 */
public class LeetCode802 {
    private static final String SEPARATE = "#";

    public int minimumLengthEncoding(String[] words) {
        List<String> wordList = Arrays.stream(words).distinct()
                .sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (String word : wordList) {
            if (!sb.toString().contains(word + SEPARATE)) {
                sb.append(word).append(SEPARATE);
            }
        }
        return sb.length();
    }
}
