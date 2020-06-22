package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/22 23:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1474Test {
    @Test
    public void test1() {
        LeetCode1474 leetCode1474 = new LeetCode1474();
        ListNode head = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);
        ListNode p6 = new ListNode(6);
        ListNode p7 = new ListNode(7);
        ListNode p8 = new ListNode(8);
        ListNode p9 = new ListNode(9);
        ListNode p10 = new ListNode(10);
        ListNode p11 = new ListNode(11);
        ListNode p12 = new ListNode(12);
        ListNode p13 = new ListNode(13);
        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = p8;
        p8.next = p9;
        p9.next = p10;
        p10.next = p11;
        p11.next = p12;
        p12.next = p13;
        int m = 2;
        int n = 3;
        ListNode resultHead = leetCode1474.deleteNodes(head, m, n);
        Assert.assertEquals(1, resultHead.val);
        ListNode p = resultHead.next;
        Assert.assertEquals(2, p.val);
        p = p.next;
        Assert.assertEquals(6, p.val);
        p = p.next;
        Assert.assertEquals(7, p.val);
        p = p.next;
        Assert.assertEquals(11, p.val);
        p = p.next;
        Assert.assertEquals(12, p.val);
    }
}
