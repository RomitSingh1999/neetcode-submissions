class Solution {
     public int minEatingSpeed(int[] piles, int h) {
        int maxpile = 0;
        for (int pile : piles) {
            maxpile = Math.max(maxpile, pile);
        }
        
        
        int left = 1;
        int right = maxpile;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
    private boolean canEatAll(int[] piles, int h, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / speed);
        }
        return hours <= h;
    }
}
