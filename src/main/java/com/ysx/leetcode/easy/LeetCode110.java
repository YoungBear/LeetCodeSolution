/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/7 23:29
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 110. 平衡二叉树
 * https://leetcode-cn.com/problems/balanced-binary-tree/
 * 树
 * DFS 深度优先搜索
 * 二叉树的每个节点的左右子树的高度差的绝对值不超过 11，则二叉树是平衡二叉树。根据定义，一棵二叉树是平衡二叉树，当且仅当其所有子树也都是平衡二叉树
 */
public class LeetCode110 {
    /**
     * DFS
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(depth(root.left) - depth(root.right)) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    /**
     * DFS
     *
     * @param root
     * @return
     */
    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    /**
     * 自底向上
     * 自底向上递归的做法类似于后序遍历，对于当前遍历到的节点，先递归地判断其左右子树是否平衡，
     * 再判断以当前节点为根的子树是否平衡。如果一棵子树是平衡的，则返回其高度（高度一定是非负整数），
     * 否则返回 −1。如果存在一棵子树不平衡，则整个二叉树一定不平衡。
     *
     * @param root
     * @return
     */
    public boolean isBalanced2(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        // 子树不平衡，则返回-1，该树一定不平衡
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

}
