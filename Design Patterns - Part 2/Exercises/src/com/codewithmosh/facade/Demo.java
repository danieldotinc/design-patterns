package com.codewithmosh.facade;

public class Demo {
  public static void show() {
    TwitterApi twitterApi = new TwitterApi("app", "secret");
    twitterApi.getRecentTweets();
  }
}
