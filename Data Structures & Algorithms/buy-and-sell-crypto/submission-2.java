class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
      int rightMax = prices[n-1];
      
       int answer = 0;
       for(int i = n-2;i>=0;i--){
        rightMax = Math.max(rightMax,prices[i]);
        answer = Math.max(rightMax-prices[i],answer);
       }

        return answer;
    }
}
