package org.example.twitter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Twitter {
    UserTweet userTweet = new UserTweet();
    UserRelationShip userRelationShip = new UserRelationShip();

    public Twitter() {

    }

    // O(n), space, O(n)
    public void postTweet(int userId, int tweetId) {
        Tweet tweet = new Tweet(userId, System.nanoTime(), tweetId);
        userRelationShip
                .getFollowers(userId)
                .stream()
                .forEach(user -> userTweet.saveTweet(user, tweet));
        userTweet.saveTweet(userId, tweet);
    }

    // O(n^2)
    public List<Integer> getNewsFeed(int userId) {

        return userTweet
                .getTweet(userId)
                .stream()
                .map(item -> item.tweetId)
                .toList();
    }

    // O(1)

    public void follow(int followerId, int followeeId) {
        if (userRelationShip.follow(followerId, followeeId)) {
            List<Tweet> tweet = userTweet.getTweet(followeeId);
            tweet
                    .stream()
                    .filter(item -> item.userId == followeeId)
                    .forEach(item -> userTweet.saveTweet(followerId, item));
        }


    }

    // O(n)
    public void unfollow(int followerId, int followeeId) {
        userTweet.removeTweetByUser(followerId, followeeId);
        userRelationShip.unfollow(followerId, followeeId);
    }


}

class UserRelationShip {
    Map<Integer, Set<Integer>> relation = new HashMap<>();

    public boolean follow(int followerId, int followeeId) {
        if (!relation.containsKey(followeeId)) {
            relation.put(followeeId, new HashSet<>());
        }
        Set<Integer> integers = relation.get(followeeId);
        if (integers.contains(followerId)) {
            return false;
        } else {
            integers.add(followerId);
            return true;
        }
    }

    public Set<Integer> getFollowers(int userId) {
        return relation.getOrDefault(userId, Set.of());
    }

    public void unfollow(int followerId, int followeeId) {
        if (relation.containsKey(followeeId)) {
            relation.get(followeeId).remove((Object) followerId);
        }
    }
}

class UserTweet {
    Map<Integer, Set<Tweet>> map = new HashMap<>();

    void saveTweet(Integer userId, Tweet tweet) {
        if (!map.containsKey(userId)) {
            map.put(userId, new HashSet<>());
        }
        map.get(userId).add(tweet);
    }


    void removeTweetByUser(Integer userId, Integer followId) {
        Set<Tweet> tweets = map.get(userId);
        tweets.removeIf(item -> item.userId == followId);
    }

    List<Tweet> getTweet(Integer userId) {
        if (map.containsKey(userId)) {
            Set<Tweet> tweets = map.get(userId);
            return tweets.stream().sorted().limit(10).toList();
        }
        return List.of();
    }
}

class Tweet implements Comparable<Tweet> {
    public Tweet(int userId, long createdTime, int tweetId) {
        this.userId = userId;
        this.createdTime = createdTime;
        this.tweetId = tweetId;
    }

    int userId;
    long createdTime;
    int tweetId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return tweetId == tweet.tweetId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tweetId);
    }

    @Override
    public int compareTo(Tweet o) {
        return Long.compare(o.createdTime, this.createdTime);
    }
}