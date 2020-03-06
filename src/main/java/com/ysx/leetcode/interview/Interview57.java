package com.ysx.leetcode.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/3/6 22:29
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 面试题57 - II. 和为s的连续正数序列
 * https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
 */
public class Interview57 {

    /**
     * a0,a0+1,a0+2,...,a0+(k-1)
     * 等差数列的前k项和公式为S = (2 * a0 + k - 1) * k / 2
     * 根据S和k，得到 a0=(2*S/k - k + 1)/2
     *
     * @param target
     * @return
     */
    public int[][] findContinuousSequence(int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int k = (int) Math.sqrt(2 * target); k >= 2; k--) {
            int a0 = (2 * target / k - k + 1) / 2;
            if (a0 <= 0) {
                // 不考虑0或者负数
                continue;
            }
            if (target == ((k * k + 2 * a0 * k - k) / 2)) {
                List<Integer> tempList = new ArrayList<>();
                for (int i = 0; i < k; i++) {
                    tempList.add(a0 + i);
                }
                list.add(tempList);
            }
        }
        int[][] result = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i).stream().mapToInt(Integer::intValue).toArray();
        }
        return result;
    }
}
