package com.codewithmosh.facade;

import java.util.List;

public class TwitterApi {
    private String appKey;
    private String secret;

    public TwitterApi(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    private String getAccess(){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey,secret);
        var accessToken = oauth.getAccessToken(requestToken);
        return accessToken;
    }
    public List<Tweet> getRecentTweets() {
        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(getAccess());
        return tweets;
    }
}
