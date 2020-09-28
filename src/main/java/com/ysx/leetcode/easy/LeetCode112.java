package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/9/29 00:03
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 112. 路径总和
 */
public class LeetCode112 {

    /**
     * 广度优先搜索
     *
     * @param root 根节点
     * @param sum 目标和
     * @return 是否存在路径
     */
    public boolean hasPathSum2(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        // 节点队列
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        // 当前值队列
        Queue<Integer> valQueue = new LinkedList<>();
        nodeQueue.offer(root);
        valQueue.offer(root.val);
        while (!nodeQueue.isEmpty()) {
            TreeNode curNode = nodeQueue.poll();
            int curVal = valQueue.poll();
            if (curNode.left == null && curNode.right == null) {
                // 如果当前为叶节点并且当前值等于sum，则返回true
                if (curVal == sum) {
                    return true;
                }
                continue;
            }
            // 左节点如队列，当前节点值加上左节点的值入队列
            if (curNode.left != null) {
                nodeQueue.offer(curNode.left);
                valQueue.offer(curNode.left.val + curVal);
            }
            if (curNode.right != null) {
                nodeQueue.offer(curNode.right);
                valQueue.offer(curNode.right.val + curVal);
            }
        }
        return false;
    }

    /**
     * 递归
     *
     * @param root 根节点
     * @param sum  目标和
     * @return 是否存在路径
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
