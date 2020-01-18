# [LeetCode 1309. 解码字母到整数映射](https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/)

## 1. 题目描述

给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：

字符（'a' - 'i'）分别用（'1' - '9'）表示。
字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
返回映射之后形成的新字符串。

题目数据保证映射始终唯一。

 

**示例 1：**

```
输入：s = "10#11#12"
输出："jkab"
解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
```

**示例 2：**

```
输入：s = "1326#"
输出："acz"
```

**示例 3：**

```
输入：s = "25#"
输出："y"
```

**示例 4：**

```
输入：s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
输出："abcdefghijklmnopqrstuvwxyz"
```

**提示：**

```
1. 1 <= s.length <= 1000
2. s[i] 只包含数字（'0'-'9'）和 '#' 字符。
3. s 是映射始终存在的有效字符串。
```



## 2. 思路

### 2.1 使用map保存编码到字母的映射关系

使用map保存编码到字母的映射关系
遍历时，先判断长度为3的编码是否在map中，如果有则获取；否则获取长度为1的编码。

**复杂度：**

- 时间复杂度为O(n)
- 空间复杂度O(1)

**执行结果：**

- 执行用时 :2 ms, 在所有 Java 提交中击败了68.26%的用户
- 内存消耗 :35.6 MB, 在所有 Java 提交中击败了42.22%的用户



### 2.2 直接解析字符的关系获得



**复杂度：**

- 时间复杂度为O(n)
- 空间复杂度O(1)

**执行结果：**

- 执行用时 :2 ms, 在所有 Java 提交中击败了68.26%的用户
- 内存消耗 :35.5 MB, 在所有 Java 提交中击败了48.80%的用户

## 3. 代码

### 3.1 使用map

```java
    private static final Map<String, String> MAP = new HashMap<>();

    static {
        MAP.put("1", "a");
        MAP.put("2", "b");
        MAP.put("3", "c");
        MAP.put("4", "d");
        MAP.put("5", "e");
        MAP.put("6", "f");
        MAP.put("7", "g");
        MAP.put("8", "h");
        MAP.put("9", "i");
        MAP.put("10#", "j");
        MAP.put("11#", "k");
        MAP.put("12#", "l");
        MAP.put("13#", "m");
        MAP.put("14#", "n");
        MAP.put("15#", "o");
        MAP.put("16#", "p");
        MAP.put("17#", "q");
        MAP.put("18#", "r");
        MAP.put("19#", "s");
        MAP.put("20#", "t");
        MAP.put("21#", "u");
        MAP.put("22#", "v");
        MAP.put("23#", "w");
        MAP.put("24#", "x");
        MAP.put("25#", "y");
        MAP.put("26#", "z");
    }

    /**
     * 使用map保存编码到字母的映射关系
     * 遍历时，先判断长度为3的编码是否在map中，如果有则获取；否则获取长度为1的编码。
     *
     * @param s
     * @return
     */
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i + 3 <= s.length()) {
                if (MAP.containsKey(s.substring(i, i + 3))) {
                    result.append(MAP.get(s.substring(i, i + 3)));
                    i += 3;
                } else {
                    result.append(MAP.get(s.substring(i, i + 1)));
                    i++;
                }
            } else {
                result.append(MAP.get(s.substring(i, i + 1)));
                i++;
            }
        }
        return result.toString();
    }
```



### 3.2 解析数字

```java
    /**
     * 直接解析字符的关系获得
     *
     * @param s
     * @return
     */
    public String freqAlphabets2(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i + 3 <= s.length()) {
                if (s.substring(i, i + 3).charAt(2) == '#') {
                    result.append((char) (Integer.parseInt(s.substring(i, i + 2)) - 1 + 'a'));
                    i += 3;
                } else {
                    result.append((char) (Integer.parseInt(s.substring(i, i + 1)) - 1 + 'a'));
                    i++;
                }
            } else {
                result.append((char) (Integer.parseInt(s.substring(i, i + 1)) - 1 + 'a'));
                i++;
            }
        }
        return result.toString();
    }
```



## [LeetCode练习笔记](https://github.com/YoungBear/LeetCodeSolution)