class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int start = 0;
        int last = k;
        int n = nums.length;

        if(n == 1) return new int[]{nums[0]} ;
        if(k == 1) return nums;
        int[] ans = new int[n-k+1];
        int j = 0;
        boolean flag = true;
        int max = Integer.MIN_VALUE;
        while(last <= n){
            if(flag){
                 max = Integer.MIN_VALUE;
 for(int i = start;i<last;i++){
            max = Math.max(max,nums[i]);
        }
            }
            else{
            max = Math.max(max,nums[last-1]);
        }
            ans[j] = max;
            if(nums[start] < max){
                flag = false;
            }
            else{
                flag = true;
            }
            j++;
            start++;
            last++;
        }

        return ans;
    }
}
