package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/4/6 10:08
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1022Test {
    @Test
    public void test1() {
        LeetCode1022 leetCode1022 = new LeetCode1022();
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(0);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(0);
        TreeNode n5 = new TreeNode(1);
        TreeNode n6 = new TreeNode(0);
        TreeNode n7 = new TreeNode(1);
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        root.left = n2;
        root.right = n3;
        int sum = leetCode1022.sumRootToLeaf(root);
        int excepted = 22;
        Assert.assertEquals(excepted, sum);
    }
}
