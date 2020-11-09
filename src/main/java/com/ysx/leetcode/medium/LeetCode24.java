/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import com.ysx.leetcode.common.ListNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/10/20 22:40
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 24. 两两交换链表中的节点
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class LeetCode24 {
    /**
     * 递归法
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode p = swapPairs(head.next.next);
        ListNode second = head.next;
        head.next = p;
        second.next = head;
        return second;
    }
}
