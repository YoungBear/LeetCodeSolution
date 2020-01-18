# [LeetCode 249. 移位字符串分组](https://leetcode-cn.com/problems/group-shifted-strings/)

## 1. 题目描述

给定一个字符串，对该字符串可以进行 “移位” 的操作，也就是将字符串中每个字母都变为其在字母表中后续的字母，比如："abc" -> "bcd"。这样，我们可以持续进行 “移位” 操作，从而生成如下移位序列：

"abc" -> "bcd" -> ... -> "xyz"
给定一个包含仅小写字母字符串的列表，将该列表中所有满足 “移位” 操作规律的组合进行分组并返回。

**示例：**

```
输入: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"]
输出: 
[
  ["abc","bcd","xyz"],
  ["az","ba"],
  ["acef"],
  ["a","z"]
]
```

## 2. 思路

用一个`List<List<String>> result`来保存结果。遍历strings的元素s，如果可以在当前list中找到与s可以通过移位相等的元素，则将s添加到这个list中，否则，新建一个list，把list添加到result中。

复杂度：

- 时间复杂度： O(n*n)
- 空间复杂度：O(n)

执行结果：

- 执行用时 :5 ms, 在所有 Java 提交中击败了37.50%的用户
- 内存消耗 :36.5 MB, 在所有 Java 提交中击败了38.42%的用户



## 3. 代码

```java
    /**
     * 用一个List<List<String>> result来保存结果
     * 遍历strings的元素s，如果可以在当前list中找到与s可以通过移位相等的元素，则将s添加到这个list中，
     * 否则，新建一个list，把list添加到result中
     *
     * @param strings
     * @return
     */
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<>();
        for (String s : strings) {
            boolean flag = false;
            for (List<String> list : result) {
                if (!list.isEmpty() && isValid(s, list.get(0))) {
                    list.add(s);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                result.add(list);
            }
        }
        return result;
    }

    /**
     * 判断两个字符串是否可以通过移位相等
     *
     * @param a
     * @param b
     * @return
     */
    private boolean isValid(String a, String b) {
        if (a.length() == b.length()) {
            int diff = Integer.MAX_VALUE;
            for (int i = 0; i < a.length(); i++) {
                if (Integer.MAX_VALUE == diff) {
                    diff = (a.charAt(i) - b.charAt(i) + 26) % 26;
                } else {
                    if (diff != (a.charAt(i) - b.charAt(i) + 26) % 26) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
```



## [LeetCode练习笔记](https://github.com/YoungBear/LeetCodeSolution)