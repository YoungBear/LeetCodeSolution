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
 * @date 2020/12/9 23:51
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode257Test {
    @Test
    public void test1() {
        LeetCode257 leetCode257 = new LeetCode257();
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        root.left = n2;
        root.right = n3;
        n2.right = n5;
        List<String> list = leetCode257.binaryTreePaths(root);
        Assert.assertEquals(2, list.size());
    }
}
