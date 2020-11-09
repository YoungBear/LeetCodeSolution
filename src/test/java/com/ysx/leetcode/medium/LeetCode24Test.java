/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import com.ysx.leetcode.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/10/20 22:45
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode24Test {
    @Test
    public void test1() {
        LeetCode24 leetCode24 = new LeetCode24();
        ListNode head = null;
        ListNode result = leetCode24.swapPairs(head);
        Assert.assertNull(result);
    }

    @Test
    public void test2() {
        LeetCode24 leetCode24 = new LeetCode24();
        ListNode head = new ListNode(1);
        ListNode result = leetCode24.swapPairs(head);
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.val);
        Assert.assertNull(result.next);
    }

    @Test
    public void test3() {
        LeetCode24 leetCode24 = new LeetCode24();
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode result = leetCode24.swapPairs(head);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.val);
        Assert.assertEquals(1, result.next.val);
        Assert.assertEquals(4, result.next.next.val);
        Assert.assertEquals(3, result.next.next.next.val);
        Assert.assertNull(result.next.next.next.next);
    }
}
