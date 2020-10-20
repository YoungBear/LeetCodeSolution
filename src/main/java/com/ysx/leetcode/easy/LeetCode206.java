/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.ListNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/2 21:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 206. 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class LeetCode206 {
    /**
     * 翻转链表
     * 迭代法
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;
        ListNode next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    /**
     * 翻转链表
     * 递归法
     * 假设列表的其余部分已经被反转，现在我们应该如何反转它前面的部分
     *
     * @param head 头结点
     * @return 翻转后的链表
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 反转第二个节点
        ListNode p = reverseList2(head.next);
        // 反转第一个节点
        head.next.next = head;
        head.next = null;
        return p;
    }
}
