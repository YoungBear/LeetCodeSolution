package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/26 23:19
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 645. 错误的集合
 */
public class LeetCode645 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int index;
        for (int i = 0; i < nums.length; i++) {
            index = Math.abs(nums[i]) - 1;
            // 如果该位置元素已经被修改过，则index已经出现过一次
            if (nums[index] < 0) {
                result[0] = index + 1;
            } else {
                nums[index] = -nums[index];
            }
        }
        // 因为第一个循环已经将元素置为了负数，如果该位置元素还为正数，则说明该位置元素缺失
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }
        return result;
    }
}
