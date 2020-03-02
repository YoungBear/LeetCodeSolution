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
}
