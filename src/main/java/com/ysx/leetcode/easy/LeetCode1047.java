/*
 * Copyright (c) ysx. 2020-2021. All rights reserved.
 */

package com.ysx.leetcode.easy;

import java.util.Stack;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2021/3/10 23:46
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 栈
 * LeetCode 1047. 删除字符串中的所有相邻重复项
 */
public class LeetCode1047 {
    /**
     * 使用栈
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param S
     * @return
     */
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (char curChar : S.toCharArray()) {
            if (stack.isEmpty() || curChar != stack.peek()) {
                stack.push(curChar);
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
