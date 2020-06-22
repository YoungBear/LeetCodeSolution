package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.ListNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/22 22:45
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1474. 删除链表 M 个节点之后的 N 个节点
 * https://leetcode-cn.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/
 */
public class LeetCode1474 {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode p = head;
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < m - 1; i++) {
                if (p == null) {
                    flag = false;
                    break;
                }
                p = p.next;
            }
            if (!flag || p == null) {
                break;
            }
            ListNode q = p.next;
            for (int i = 0; i < n; i++) {
                if (q == null) {
                    flag = false;
                    break;
                }
                q = q.next;
            }
            p.next = q;
            p = q;
        }
        return head;
    }

}
