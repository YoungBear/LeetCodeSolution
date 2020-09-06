/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/27 21:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 345. 反转字符串中的元音字母
 * https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 */
public class LeetCode345 {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left < array.length && !isVowel(array[left])) {
            left++;
        }
        while (right >= 0 && !isVowel(array[right])) {
            right--;
        }
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
            while (left < array.length && !isVowel(array[left])) {
                left++;
            }
            while (right >= 0 && !isVowel(array[right])) {
                right--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : array) {
            sb.append(ch);
        }
        return sb.toString();
    }

    /**
     * 判断是否为元音字符
     *
     * @param ch
     * @return
     */
    private boolean isVowel(char ch) {
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
