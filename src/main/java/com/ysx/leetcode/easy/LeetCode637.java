/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/9/6 9:41
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 637. 二叉树的层平均值
 * https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
 */
public class LeetCode637 {
    /**
     * 二叉树的层平均值
     *
     * @param root 根节点
     * @return 按层的平均值
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> nodeList = new LinkedList<>();
        nodeList.add(root);
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
            result.add(list.stream().mapToInt(i -> i).average().orElse(0));
            nodeList.clear();
            nodeList.addAll(temp);
        }
        return result;
    }
}
