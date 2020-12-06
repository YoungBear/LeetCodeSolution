/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 23:12
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 938. 二叉搜索树的范围和
 * https://leetcode-cn.com/problems/range-sum-of-bst/
 * DFS 深度优先搜索
 */
public class LeetCode938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (null == root) {
            return 0;
        }
        int result = 0;
        if (root.val >= low && root.val <= high) {
            result += root.val;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left != null) {
            if (left.val >= low) {
                result += rangeSumBST(left, low, high);
            } else {
                result += rangeSumBST(left.right, low, high);
            }
        }
        if (right != null) {
            if (right.val <= high) {
                result += rangeSumBST(right, low, high);
            } else {
                result += rangeSumBST(right.left, low, high);
            }
        }
        return result;
    }
}
