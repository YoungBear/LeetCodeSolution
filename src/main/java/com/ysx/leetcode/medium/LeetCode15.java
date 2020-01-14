package com.ysx.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/14 21:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 15. 三数之和
 * https://leetcode-cn.com/problems/3sum/
 */
public class LeetCode15 {
    /**
     * 先排序，使用左右双指针，每次找到答案后，遍历去掉重复的元素
     * 时间复杂度为O(n*n)，空间复杂度为O(1)
     *
     * 执行用时 :32 ms, 在所有 Java 提交中击败了95.72%的用户
     * 内存消耗 :47.5 MB, 在所有 Java 提交中击败了94.36%的用户
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (null == nums || nums.length < 3) {
            return resultList;
        }
        // 先排序
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return resultList;
            }
            // 不遍历重复元素
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    // 三个数之和等于0
                    resultList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 跳过左指针相同的元素
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // 跳过右指针相同的元素
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // 下一次循环，移动左右指针
                    left++;
                    right--;
                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    // 三个数之和大于0，移动右指针
                    right--;
                } else {
                    // 三个数之和小于0，移动右指针
                    left++;
                }
            }
        }
        return resultList;
    }
}
