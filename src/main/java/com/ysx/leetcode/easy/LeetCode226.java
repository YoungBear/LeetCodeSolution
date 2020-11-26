/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/11/27 0:01
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 226. 翻转二叉树
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * 递归
 */
public class LeetCode226 {
    /**
     * 递归
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
