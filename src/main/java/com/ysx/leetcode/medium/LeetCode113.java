package com.ysx.leetcode.medium;

import com.ysx.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/9/29 00:06
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 113. 路径总和 II
 */
public class LeetCode113 {
    /**
     * 所有从根节点到叶子节点路径总和等于给定目标和的路径
     *
     * @param root 根节点
     * @param sum  目标和
     * @return 路径列表
     */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, sum, new ArrayList<>(), result);
        return result;
    }

    /**
     * 递归
     *
     * @param root   根节点
     * @param sum    当前目标数
     * @param list   当前路径
     * @param result 总的列表结果
     */
    public void dfs(TreeNode root, int sum, List<Integer> list, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        List<Integer> subList = new ArrayList<>(list);
        subList.add(root.val);
        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                result.add(subList);
            }
            return;
        }
        dfs(root.left, sum - root.val, subList, result);
        dfs(root.right, sum - root.val, subList, result);
    }
}
