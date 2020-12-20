/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.Stack;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/20 18:16
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 316. 去除重复字母
 * https://leetcode-cn.com/problems/remove-duplicate-letters/
 * 贪心算法
 */
public class LeetCode316 {
    /**
     * 贪心：使用栈
     *
     * @param s
     * @return
     */
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 若栈中已经有当前元素，则直接去除当前元素
            if (stack.contains(ch)) {
                continue;
            }
            // 若当前的栈顶元素比当前的元素字典序大，且当前元素的位置后面还有栈顶元素,
            // 将栈顶元素出栈, 将当前元素入栈, 这样来找到最优的排列
            while (!stack.empty() && stack.peek() > ch && s.indexOf(stack.peek(), i) != -1) {
                stack.pop();
            }
            stack.push(ch);
        }
        char[] res = new char[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }
        return new String(res);
    }
}
