/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

import com.ysx.leetcode.common.NestedInteger;

import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/12/6 21:56
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 339. 嵌套列表权重和
 * https://leetcode-cn.com/problems/nested-list-weight-sum/
 * 深度优先搜索 DFS
 */
public class LeetCode339 {
    public int depthSum(List<NestedInteger> nestedList) {
        return depthSum(nestedList, 1);
    }

    public int depthSum(List<NestedInteger> nestedList, int depth) {
        int sum = 0;
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                sum += nestedInteger.getInteger() * depth;
            } else {
                sum += depthSum(nestedInteger.getList(), depth + 1);
            }
        }
        return sum;
    }
}
