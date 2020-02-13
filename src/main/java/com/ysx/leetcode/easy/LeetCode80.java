package com.ysx.leetcode.easy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/12 19:42
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 80. 删除排序数组中的重复项 II
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * nums = [1,1,1,2,2,3] -> [1,1,2,2,3]length = 5
 */
public class LeetCode80 {
    /**
     * 双指针
     * 时间复杂度为 O(n)
     * 空间复杂度为 O(1)
     * 执行用时 :1 ms, 在所有 Java 提交中击败了99.80%的用户
     * 内存消耗 :46.8 MB, 在所有 Java 提交中击败了5.02%的用户
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int cur = 1;
        for (int i = 2; i < nums.length; i++) {
            // 判断与当前数不相等，或者相等的不超过2个数，可简化为 nums[cur-1] != nums[i]
            if (nums[cur - 1] != nums[i]) {
                cur++;
                nums[cur] = nums[i];
            }
        }
        return cur + 1;
    }
}
