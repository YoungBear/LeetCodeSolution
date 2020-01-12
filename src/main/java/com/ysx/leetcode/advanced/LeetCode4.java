package com.ysx.leetcode.advanced;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/1/12 22:01
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 4. 寻找两个有序数组的中位数
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 */
public class LeetCode4 {
    /**
     * 合并两个数组，然后找到其中位数
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        if (0 == length1) {
            return findMedianSortedArray(nums2);
        } else if (0 == length2) {
            return findMedianSortedArray(nums1);
        }
        // 合并两个数组
        int[] nums = new int[length1 + length2];
        int i = 0, j = 0, k = 0;
        while (j < length1 && k < length2) {
            if (nums1[j] < nums2[k]) {
                nums[i++] = nums1[j++];
            } else {
                nums[i++] = nums2[k++];
            }
        }
        while (j < length1) {
            nums[i++] = nums1[j++];
        }
        while (k < length2) {
            nums[i++] = nums2[k++];
        }
        return findMedianSortedArray(nums);
    }

    /**
     * 返回单个数组的中位数
     *
     * @param nums
     * @return
     */
    private double findMedianSortedArray(int[] nums) {
        int length = nums.length;
        if (0 == length % 2) {
            return ((double) nums[length / 2 - 1] + nums[length / 2]) / 2;
        } else {
            return nums[length / 2];
        }
    }
}
