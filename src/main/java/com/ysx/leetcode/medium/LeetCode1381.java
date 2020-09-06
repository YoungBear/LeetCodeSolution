/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.Stack;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/12 21:45
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1381. 设计一个支持增量操作的栈
 * https://leetcode-cn.com/problems/design-a-stack-with-increment-operation/
 */
public class LeetCode1381 {
    private int maxSize;
    private Stack<Integer> stack;

    public LeetCode1381(int maxSize) {
        this.maxSize = maxSize;
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.size() < maxSize) {
            stack.push(x);
        }
    }

    public int pop() {
        if (stack.empty()) {
            return -1;
        }
        return stack.pop();
    }

    public void increment(int k, int val) {
        for (int i = 0; i < stack.size() && i < k; i++) {
            stack.set(i, stack.get(i) + val);
        }
    }
}
