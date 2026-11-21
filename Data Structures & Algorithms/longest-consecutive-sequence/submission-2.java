class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n==0) return 0;

       Arrays.sort(nums);
       int i = 0;
       int j = 1;
       int answer = 0;
       int count = 0;
        while(i < n && j< n){
            if(nums[j]-nums[i]==1){
                    count++;
            }
            else if(nums[j]-nums[i]>1){
                answer = Math.max(answer,count);
                count = 0;
            }

            
                i++;
                j++;
        }
        answer = Math.max(answer,count);
        return answer+1;
    }
}
