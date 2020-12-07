/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/7 23:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 104. 二叉树的最大深度
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * 树
 * DFS 深度优先搜索
 */
public class LeetCode104 {
    /**
     * DFS
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
