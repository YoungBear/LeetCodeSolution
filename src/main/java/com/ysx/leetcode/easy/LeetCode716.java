package com.ysx.leetcode.easy;

import java.util.Stack;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/12 21:42
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 716. 最大栈
 * https://leetcode-cn.com/problems/max-stack/
 */
public class LeetCode716 {
    // 存储元素
    private Stack<Integer> stack;
    // 存储当前栈中最大元素于栈顶
    private Stack<Integer> max;

    /**
     * initialize your data structure here.
     */
    public LeetCode716() {
        stack = new Stack<>();
        max = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        int maxValue = max.isEmpty() ? x : max.peek();
        max.push(Math.max(maxValue, x));
    }

    public int pop() {
        max.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return max.peek();
    }

    public int popMax() {
        int maxValue = max.peek();
        Stack<Integer> buffer = new Stack<>();
        // 从栈顶找到maxValue元素，并将栈顶元素重新入栈缓存
        while (top() != maxValue) {
            buffer.push(pop());
        }
        // 最大元素出栈
        pop();
        // 重新入栈
        while (!buffer.isEmpty()) {
            push(buffer.pop());
        }
        return maxValue;
    }
}
