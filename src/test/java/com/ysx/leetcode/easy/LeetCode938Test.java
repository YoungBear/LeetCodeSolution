/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 23:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode938Test {
    @Test
    public void test1() {
        LeetCode938 leetCode938 = new LeetCode938();
        TreeNode t10 = new TreeNode(10);
        TreeNode t5 = new TreeNode(5);
        TreeNode t15 = new TreeNode(15);
        TreeNode t3 = new TreeNode(3);
        TreeNode t7 = new TreeNode(7);
        TreeNode t18 = new TreeNode(18);
        t10.left = t5;
        t10.right = t15;
        t5.left = t3;
        t5.right = t7;
        t15.right = t18;
        int excepted = 32;
        Assert.assertEquals(excepted, leetCode938.rangeSumBST(t10, 7, 15));
    }
}
