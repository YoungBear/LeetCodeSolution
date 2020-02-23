package com.ysx.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/2/23 9:33
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 1243. 数组变换
 * https://leetcode-cn.com/problems/array-transformation/
 * 首先，给你一个初始数组 arr。然后，每天你都要根据前一天的数组生成一个新的数组。
 * <p>
 * 第 i 天所生成的数组，是由你对第 i-1 天的数组进行如下操作所得的：
 * <p>
 * 假如一个元素小于它的左右邻居，那么该元素自增 1。
 * 假如一个元素大于它的左右邻居，那么该元素自减 1。
 * 首、尾元素 永不 改变。
 * 过些时日，你会发现数组将会不再发生变化，请返回最终所得到的数组。
 */
public class LeetCode1243 {
    public List<Integer> transformArray(int[] arr) {
        List<Integer> resultList = new ArrayList<>();
        for (int n : arr) {
            resultList.add(n);
        }
        if (resultList.size() <= 2) {
            return resultList;
        } else {
            transform(resultList);
        }
        return resultList;
    }

    private void transform(List<Integer> list) {
        boolean flag = true;
        while (flag) {
            flag = false;
            List<Integer> tempList = new ArrayList<>(list);
            for (int i = 1; i < list.size() - 1; i++) {
                Integer left = list.get(i - 1);
                Integer right = list.get(i + 1);
                Integer cur = list.get(i);
                if (cur > left && cur > right) {
                    flag = true;
                    tempList.set(i, cur - 1);
                } else if (cur < left && cur < right) {
                    flag = true;
                    tempList.set(i, cur + 1);
                }
            }
            list.clear();
            list.addAll(tempList);
        }
    }
}
