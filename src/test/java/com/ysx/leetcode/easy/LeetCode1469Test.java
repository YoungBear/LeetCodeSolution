/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 23:02
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1469Test {
    @Test
    public void test1() {
        LeetCode1469 leetCode1469 = new LeetCode1469();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        List<Integer> list = leetCode1469.getLonelyNodes(t1);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(4, list.get(0).intValue());
    }
}
