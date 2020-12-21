/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import java.util.Stack;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/21 23:02
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1265. 逆序打印不可变链表
 * 栈
 */
public class LeetCode1265 {
    /**
     * 使用栈
     *
     * @param head
     */
    public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> stack = new Stack<>();
        ImmutableListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.getNext();
        }
        while (!stack.empty()) {
            stack.pop().printValue();
        }
    }


    interface ImmutableListNode {
        void printValue(); // print the value of this node.

        ImmutableListNode getNext(); // return the next node.
    }
}
