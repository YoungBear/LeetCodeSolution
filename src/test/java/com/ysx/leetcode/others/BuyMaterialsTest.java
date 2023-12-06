/*
 * Copyright (c) ysx. 2020-2023. All rights reserved.
 */

package com.ysx.leetcode.others;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2023-12-06 22:41
 * @blog <a href="https://blog.csdn.net/next_second">...</a>
 * @github <a href="https://github.com/YoungBear">...</a>
 * @description
 */
public class BuyMaterialsTest {

    @Test
    public void test1() {
        BuyMaterials buyMaterials = new BuyMaterials();
        int[][] materials = {{100, 200}, {9, 2}, {10, 3}, {10, 1}, {10, 3}};
        int n = 4;
        Assert.assertEquals(39, buyMaterials.minCost(materials, n));
    }
}
