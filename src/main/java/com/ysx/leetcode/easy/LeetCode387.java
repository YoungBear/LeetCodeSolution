package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/6 11:27
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 387. 字符串中的第一个唯一字符
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 */
public class LeetCode387 {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(0, i).indexOf(s.charAt(i)) == -1
                    && s.substring(i + 1).indexOf(s.charAt(i)) == -1) {
                return i;
            }
        }
        return -1;
    }
}
