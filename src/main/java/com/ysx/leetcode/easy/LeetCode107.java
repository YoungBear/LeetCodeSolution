package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/9/6 9:13
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 107. 二叉树的层次遍历 II
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * 相关：102. 二叉树的层次遍历
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class LeetCode107 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add(0, "abc");
        list.forEach(System.out::println);
    }

    /**
     * 参考 102. 二叉树的层次遍历
     * 添加到结果返回值时，每次添加到列表头
     *
     * @param root 根节点
     * @return 遍历列表
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
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
            result.add(0, list);
            nodeList.clear();
            nodeList.addAll(temp);
        }
        return result;
    }
}
