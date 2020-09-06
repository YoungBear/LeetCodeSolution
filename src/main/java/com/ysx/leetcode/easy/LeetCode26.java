/*
 * Copyright (c) ysx. 2020-2020. All rights reserved.
 */

package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/12 19:10
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 26. 删除排序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class LeetCode26 {
    /**
     * 如 nums = [1,1,2]，处理后成为[1,2,2]，返回长度 2
     * 双指针解法:cur指针用来记录当前不重复的数字，i用来遍历元素
     * 时间复杂度为 O(n)
     * 空间复杂度为 O(1)
     * 执行用时 :1 ms, 在所有 Java 提交中击败了99.98%的用户
     * <p>
     * 内存消耗 :48.7 MB, 在所有 Java 提交中击败了5.02%的用户
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (0 == nums.length) {
            return 0;
        }
        int cur = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[cur] != nums[i]) {
                cur++;
                nums[cur] = nums[i];
            }
        }
        return cur + 1;
    }
}
