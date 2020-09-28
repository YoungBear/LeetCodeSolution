package com.ysx.leetcode.medium;

import java.util.*;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/9/29 00:08
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description 355. 设计推特
 */
public class LeetCode355 {

    // 用户id与其关注的用户集合的关系
    private Map<Integer, Set<Integer>> followeeMap;

    // 推特id与其创建者的关系
    private Map<Integer, Integer> tweetToUserMap;

    // 推特id列表
    private List<Integer> tweetIdList;

    /**
     * 初始化数据
     */
    public LeetCode355() {
        followeeMap = new HashMap<>();
        tweetToUserMap = new HashMap<>();
        tweetIdList = new ArrayList<>();
    }

    /**
     * 创建一条新的推文
     *
     * @param userId  用户id
     * @param tweetId 推文id
     */
    public void postTweet(int userId, int tweetId) {
        tweetToUserMap.put(tweetId, userId);
        tweetIdList.add(tweetId);
    }

    /**
     * 检索最近的十条推文。每个推文都必须是由此用户关注的人或者是用户自己发出的。推文必须按照时间顺序由最近的开始排序。
     * 时间复杂度为 O(n),n为推特总数
     *
     * @param userId 用户id
     * @return 最近的十条推文列表
     */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<>();
        for (int i = tweetIdList.size() - 1; i >= 0 && result.size() < 10; i--) {
            int owner = tweetToUserMap.get(tweetIdList.get(i));
            // 如果这条推特的创建者是该用户，或者这条推特的创建者在该用户的关注者的集合中，则返回该条推特
            if (owner == userId || (followeeMap.containsKey(userId) && followeeMap.get(userId).contains(owner))) {
                result.add(tweetIdList.get(i));
            }
        }
        return result;
    }

    /**
     * 关注一个用户
     *
     * @param followerId 关注者id
     * @param followeeId 被关注者id
     */
    public void follow(int followerId, int followeeId) {
        Set<Integer> followeeIdSet = followeeMap.computeIfAbsent(followerId, k -> new HashSet<>());
        followeeIdSet.add(followeeId);
    }

    /**
     * 取消关注
     *
     * @param followerId 关注者id
     * @param followeeId 被关注者id
     */
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followeeIdSet = followeeMap.get(followerId);
        if (null != followeeIdSet) {
            followeeIdSet.remove(followeeId);
        }
    }
}
