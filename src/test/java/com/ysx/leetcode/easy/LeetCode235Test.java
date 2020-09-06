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
 * @date 2020/5/1 4:28
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode235Test {
    @Test
    public void test1() {
        LeetCode235 leetCode235 = new LeetCode235();
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        n4.left = n3;
        n4.right = n5;
        TreeNode n0 = new TreeNode(0);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n2 = new TreeNode(2);
        n2.left = n0;
        n2.right = n4;
        TreeNode n8 = new TreeNode(8);
        n8.left = n7;
        n8.right = n9;
        TreeNode n6 = new TreeNode(6);
        n6.left = n2;
        n6.right = n8;
        Assert.assertEquals(n6, leetCode235.lowestCommonAncestor(n6, n2, n8));
        Assert.assertEquals(n2, leetCode235.lowestCommonAncestor(n6, n2, n4));
        Assert.assertEquals(n4, leetCode235.lowestCommonAncestor(n6, n3, n5));
    }
}
