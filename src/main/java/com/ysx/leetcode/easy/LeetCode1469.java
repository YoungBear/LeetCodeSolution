/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 22:56
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1469. 寻找所有的独生节点
 * https://leetcode-cn.com/problems/find-all-the-lonely-nodes/
 * DFS 深度优先搜索
 * 二叉树中，如果一个节点是其父节点的唯一子节点，则称这样的节点为 “独生节点” 。二叉树的根节点不会是独生节点，因为它没有父节点。
 * <p>
 * 给定一棵二叉树的根节点 root ，返回树中 所有的独生节点的值所构成的数组 。数组的顺序 不限 。
 */
public class LeetCode1469 {
    /**
     * DFS
     *
     * @param root
     * @return
     */
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right != null) {
            result.add(right.val);
        }
        if (left != null && right == null) {
            result.add(left.val);
        }
        result.addAll(getLonelyNodes(right));
        result.addAll(getLonelyNodes(left));
        return result;
    }
}
