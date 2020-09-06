/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/5 11:44
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode617Test {
    @Test
    public void test1() {
        LeetCode617 leetCode617 = new LeetCode617();
        TreeNode t1 = new TreeNode(1);
        TreeNode t11 = new TreeNode(3);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(5);
        t11.left = t13;
        t1.left = t11;
        t1.right = t12;

        TreeNode t2 = new TreeNode(2);
        TreeNode t21 = new TreeNode(1);
        TreeNode t22 = new TreeNode(3);
        TreeNode t23 = new TreeNode(4);
        TreeNode t24 = new TreeNode(7);
        t21.right = t23;
        t22.right = t24;
        t2.left = t21;
        t2.right = t22;

        TreeNode t3 = leetCode617.mergeTrees(t1, t2);
        Assert.assertEquals(3, t3.val);
        Assert.assertEquals(4, t3.left.val);
        Assert.assertEquals(5, t3.right.val);
        Assert.assertEquals(5, t3.left.left.val);
        Assert.assertEquals(4, t3.left.right.val);
        Assert.assertEquals(7, t3.right.right.val);


    }
}
