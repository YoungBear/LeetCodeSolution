package com.ysx.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/14 21:44
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1. 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 */
public class LeetCode1 {
    /**
     * 用一个map来保存target-nums[i]及其下标，每次循环时先判断map中是否已经存在nums[i]的键值，如果已存在则返回结果
     * 时间复杂度为O(n)，空间复杂度为O(n)。
     * <p>
     * 执行用时 :3 ms, 在所有 Java 提交中击败了97.55%的用户
     * 内存消耗 :37 MB, 在所有 Java 提交中击败了92.55%的用户
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
                break;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
