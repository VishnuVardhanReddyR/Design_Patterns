package facade.solution;

public class AccessApi {
    public void request(String appKey, String appSecret){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, appSecret);
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(accessToken);
    }
}
