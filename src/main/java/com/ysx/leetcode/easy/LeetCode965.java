package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/6 09:52
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 965. 单值二叉树
 * https://leetcode-cn.com/problems/univalued-binary-tree/
 */
public class LeetCode965 {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isUnivalTree(root, root.val);
    }

    private boolean isUnivalTree(TreeNode root, int val) {
        if (root == null) {
            return true;
        }
        return root.val == val
                && isUnivalTree(root.left, val)
                && isUnivalTree(root.right, val);
    }
}
