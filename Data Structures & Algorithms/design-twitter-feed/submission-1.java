class Twitter {
    Map<Integer, TreeSet<Integer>> followingList=new HashMap<>();
    private static int timestamp = 0;
    PriorityQueue<int[]> Tweets=new PriorityQueue<>((a, b) -> b[2] - a[2]);
    public Twitter() {

    }

    public void postTweet(int userId, int tweetId) {
        Tweets.add(new int[]{userId, tweetId, timestamp++});
    }

    public List<Integer> getNewsFeed(int userId) {
        int count=10;
        List<Integer> result=new ArrayList<>();
        PriorityQueue<int[]> temp=new PriorityQueue<>(Tweets);
        while (count > 0 && !temp.isEmpty()) {
            int[] tweet = temp.poll();
            if (tweet[0] == userId || (followingList.containsKey(userId) && followingList.get(userId).contains(tweet[0]))) {
                result.add(tweet[1]);
                count--;
            }
        }
        return result;
    }

    public void follow(int followerId, int followeeId) {
        followingList.put(followerId, followingList.getOrDefault(followerId, new TreeSet<>()));
        followingList.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if(followingList.containsKey(followerId)){
            followingList.get(followerId).remove(followeeId);
        }
    }
}
