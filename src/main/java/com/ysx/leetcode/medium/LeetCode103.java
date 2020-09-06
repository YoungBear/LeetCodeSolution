/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.medium;

import com.ysx.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/9/6 9:54
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 103. 二叉树的锯齿形层次遍历
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class LeetCode103 {
    /**
     * 二叉树的锯齿形层次遍历
     * 使用队列
     *
     * @param root 根节点
     * @return 遍历列表
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> nodeList = new LinkedList<>();
        nodeList.add(root);
        // 标记是否翻转
        boolean flag = true;
        while (nodeList.size() > 0) {
            List<Integer> list = new ArrayList<>();
            List<TreeNode> temp = new LinkedList<>();
            for (TreeNode node : nodeList) {
                list.add(node.val);
                if (node.left != null) {
                    temp.add(node.left);
                }
                if (node.right != null) {
                    temp.add(node.right);
                }
            }
            if (flag) {
                result.add(list);
            } else {
                Collections.reverse(list);
                result.add(list);
            }
            nodeList.clear();
            nodeList.addAll(temp);
            flag = !flag;
        }
        return result;
    }
}
