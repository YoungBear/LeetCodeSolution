package com.ysx.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/12 22:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class LeetCode1436Test {
    @Test
    public void test1() {
        LeetCode1436 leetCode1436 = new LeetCode1436();
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));
        String excepted = "Sao Paulo";
        Assert.assertEquals(excepted, leetCode1436.destCity(paths));
    }

    @Test
    public void test2() {
        LeetCode1436 leetCode1436 = new LeetCode1436();
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("B", "C"));
        paths.add(Arrays.asList("D", "B"));
        paths.add(Arrays.asList("C", "A"));
        String excepted = "A";
        Assert.assertEquals(excepted, leetCode1436.destCity(paths));
    }

    @Test
    public void test3() {
        LeetCode1436 leetCode1436 = new LeetCode1436();
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("A", "Z"));
        String excepted = "Z";
        Assert.assertEquals(excepted, leetCode1436.destCity(paths));
    }
}
