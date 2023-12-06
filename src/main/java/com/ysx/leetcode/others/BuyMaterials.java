/*
 * Copyright (c) ysx. 2020-2023. All rights reserved.
 */

package com.ysx.leetcode.others;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2023-12-06 22:36
 * @blog <a href="https://blog.csdn.net/next_second">...</a>
 * @github <a href="https://github.com/YoungBear">...</a>
 * @description 购买材料
 * 你从供应商买材料，则呢么买花钱最少。
 * 每个供应商，每卖出一单位材料，材料单价+1，现在你要买n个单位的材料，怎么买价格才能最低？
 * 返回最低的价格。
 * 输入：{{100,200},{9,2},{10,3},{10,1},{10,3}}
 * n=4
 * 输出：39
 * 上述第一行表示供应商的{材料单价，材料个数}
 * 第二行表示你总共要买4个单位的材料
 */
public class BuyMaterials {

    /**
     * 购买材料
     * 你从供应商买材料，则呢么买花钱最少。
     * 每个供应商，每卖出一单位材料，材料单价+1，现在你要买n个单位的材料，怎么买价格才能最低？
     * 返回最低的价格。
     * 输入：{{100,200},{9,2},{10,3},{10,1},{10,3}}
     * n=4
     * 输出：39
     * 上述第一行表示供应商的{材料单价，材料个数}
     * 第二行表示你总共要买4个单位的材料
     *
     * @param materials 材料信息
     * @param n n个材料
     * @return 最低价格
     */
    public int minCost(int[][] materials, int n) {
        // 暴力法 - 每次获取单价最低价格的材料
        int sumCost = 0;
        for (int i = 0; i < n; i++) {
            int minCost = Integer.MAX_VALUE;
            int minIndex = -1;
            // 获取最小值
            for (int j = 0; j < materials.length; j++) {
                if (materials[j][1] > 0 && materials[j][0] < minCost) {
                    minCost = materials[j][0];
                    minIndex = j;
                }
            }
            sumCost += minCost;
            // 单价+1
            materials[minIndex][0] += 1;
            // 数量-1
            materials[minIndex][1] -= 1;
        }
        return sumCost;
    }
}
