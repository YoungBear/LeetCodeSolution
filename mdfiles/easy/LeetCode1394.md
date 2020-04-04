# [LeetCode 1394. 找出数组中的幸运数](https://leetcode-cn.com/problems/find-lucky-integer-in-an-array/)

## 1. 题目描述

在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。

给你一个整数数组 arr，请你从中找出并返回一个幸运数。

如果数组中存在多个幸运数，只需返回 最大 的那个。
如果数组中不含幸运数，则返回 -1 。

**提示：**

- `1 <= arr.length <= 500`
- `1 <= arr[i] <= 500`

**标签：**

数组

## 2. 思路

使用长度为500（arr最大长度）的数组count来记录每一个数字出现的次数，然后遍历count，找到下标与值相等的元素，就找到了答案。默认结果为-1。从1-500遍历，则可以找到多个幸运数中的最大的一个。

执行结果：

执行用时 :1 ms, 在所有 Java 提交中击败了100.00%的用户

内存消耗 :39.1 MB, 在所有 Java 提交中击败了100.00%的用户

时间复杂度：O(N)

空间复杂度：O(N)

## 3. 代码



```java
    private static final int MAX_LENGTH = 500;

    public int findLucky(int[] arr) {
        int[] count = new int[MAX_LENGTH];
        for (int a : arr) {
            count[a]++;
        }
        int result = -1;
        for (int i = 1; i < MAX_LENGTH; i++) {
            if (i == count[i]) {
                result = i;
            }
        }
        return result;
    }
```

## [LeetCode练习笔记](https://github.com/YoungBear/LeetCodeSolution)

