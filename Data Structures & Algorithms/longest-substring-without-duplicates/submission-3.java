class Solution {
    public int lengthOfLongestSubstring(String s) {
        int carr[] = new int[128];
        int i=0,j=0;
        int maxSub=0;
        while (j < s.length()) {

        while (carr[s.charAt(j)] > 0) {
            carr[s.charAt(i)]--;
            i++;
        }

        carr[s.charAt(j)]++;
        maxSub = Math.max(maxSub, j - i + 1);
        j++;
    }

    return maxSub;
    }
}
