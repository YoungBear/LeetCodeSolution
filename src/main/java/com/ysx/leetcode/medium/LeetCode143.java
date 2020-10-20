/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import com.ysx.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/10/20 22:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 143. 重排链表
 * https://leetcode-cn.com/problems/reorder-list/
 */
public class LeetCode143 {
    /**
     * 使用列表存储所有节点
     *
     * @param head
     */
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        ListNode cur = head;
        for (int i = 1, j = 1, k = list.size() - 1; i < list.size(); i++) {
            if (1 == i % 2) {
                cur.next = list.get(k--);
            } else {
                cur.next = list.get(j++);
            }
            cur = cur.next;
        }
        cur.next = null;
    }
}
