package org.example.twitter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwitterTest {
    Twitter twitter = new Twitter();


    @Test
    void test() {
        twitter.postTweet(1, 5);
        List<Integer> newsFeed =

                twitter.getNewsFeed(1);
        Assertions.assertEquals(List.of(5), newsFeed);
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        List<Integer> newsFeed1 = twitter.getNewsFeed(1);
        Assertions.assertEquals(List.of(6, 5), newsFeed1);

        twitter.unfollow(1, 2);
        List<Integer> newsFeed2 = twitter.getNewsFeed(1);

        Assertions.assertEquals(List.of(5), newsFeed2);


    }

    @Test
    void test1() {
        twitter.postTweet(1, 4);

        twitter.postTweet(2, 5);
        twitter.unfollow(1, 2);
        twitter.follow(1, 2);
        List<Integer> newsFeed = twitter.getNewsFeed(1);
        Assertions.assertEquals(List.of(5, 4), newsFeed);

    }
    @Test
    void test2() {
        twitter.postTweet(2, 5);

        twitter.follow(1, 2);
        twitter.follow(1, 2);
        List<Integer> newsFeed = twitter.getNewsFeed(1);
        Assertions.assertEquals(List.of(5), newsFeed);

    }
}