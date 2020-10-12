package facade.solution;

public class MainFacadeSol {
    public static void main(String[] args){
        var newTweet = new AccessApi();
        newTweet.request("appKey","secret");

        var likingTweet = new AccessApi();
        likingTweet.request("appKey","liking");
    }
}
