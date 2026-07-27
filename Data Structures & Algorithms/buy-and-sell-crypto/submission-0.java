class Solution {
    public int maxProfit(int[] prices) {
        int max_profit= 0;
        int sum = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<sum){
                sum=prices[i];
            }
            else{
                max_profit=Math.max(max_profit,prices[i]-sum);
            }
        }
        return max_profit;
    }
}
