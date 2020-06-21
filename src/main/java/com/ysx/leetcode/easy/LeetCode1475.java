package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/6/21 20:24
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1475. 商品折扣后的最终价格
 * https://leetcode-cn.com/problems/final-prices-with-a-special-discount-in-a-shop/
 */
public class LeetCode1475 {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return result;
    }
}
